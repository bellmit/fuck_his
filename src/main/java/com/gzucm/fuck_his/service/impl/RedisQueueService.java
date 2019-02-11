package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.constant.RedisContant;
import com.gzucm.fuck_his.entity.Patient;
import com.gzucm.fuck_his.repository.PatientRepository;
import com.gzucm.fuck_his.service.RedisQueue;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import com.gzucm.fuck_his.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * TODO MQ的实现
 * @author tianyi
 * @date 2018-10-22 18:37
 */
@Service
@Slf4j
public class RedisQueueService implements RedisQueue {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    /**
     * 获取消息队列
     *
     * @param doctorId
     * @return
     */
    @Override
    public CommonDTO getQueue(int doctorId) {
        String cacheName = String.format(RedisContant.DOCTOR_FORMAT,String.valueOf(doctorId));
        String cacheValue = redisTemplate.opsForValue().get(cacheName);
        if (StringUtils.isEmpty(cacheValue)){
            log.error("No patient in doctor "+doctorId);
            return CommonDTOUtil.error(404,"没有病人了");
        }else {
            String[] split = cacheValue.split("_");
            log.info("LIST={}",split);
            return CommonDTOUtil.success(split);
        }
    }

    /**
     * 呼唤下一个病人
     *
     * @param doctorId
     * @return
     */
    @Override
    public CommonDTO callNext(int doctorId) {
        String cacheName = String.format(RedisContant.DOCTOR_FORMAT,String.valueOf(doctorId));
        String cacheValue = redisTemplate.opsForValue().get(cacheName);
        if (StringUtils.isEmpty(cacheValue)){
            log.error("No patient in doctor "+doctorId);
            return CommonDTOUtil.error(404,"没有病人了");
        }else {
            String[] split = cacheValue.split("_");
            Integer nextId = Integer.parseInt(split[0]);
            String refresh = StringUtil.refreshSplit(split);
            redisTemplate.opsForValue().set(cacheName, refresh, RedisContant.EXPIRE, TimeUnit.SECONDS);
            Patient next = patientRepository.findById(nextId).get();
            log.info("cacheValue: "+cacheValue+", NEXT: {}"+", cacheValue: "+refresh, next);
            // 实现喊号（对话）+病人资料（对话）———— 喊号机和医生同时订阅该频道
            this.messagingTemplate.convertAndSendToUser(""+doctorId,"/patientMessage", next);
            return CommonDTOUtil.success(next);
        }


    }

    /**
     * 病人挂号（存信息进redis）
     *
     * @param patientId 病人id
     * @return
     */
    @Override
    public CommonDTO patientBooking(int patientId, int doctorId) {
        String cacheName = String.format(RedisContant.DOCTOR_FORMAT,String.valueOf(doctorId));
        String cacheValue = redisTemplate.opsForValue().get(cacheName);
        if (StringUtils.isEmpty(cacheValue)){
            redisTemplate.opsForValue().set(cacheName, String.valueOf(patientId), RedisContant.EXPIRE, TimeUnit.SECONDS);
            log.info("Empty cacheName: "+cacheName+", cacheValue: "+patientId);
        }else {
            String refresh = String.format(RedisContant.PATIENTS_FORMAT, cacheValue, String.valueOf(patientId));
            redisTemplate.opsForValue().set(cacheName, refresh, RedisContant.EXPIRE, TimeUnit.SECONDS);
            log.info("Not empty cacheName: "+cacheName+", cacheValue: "+refresh);
        }
        // TODO 刷新queue（广播）
        return CommonDTOUtil.success();
    }
}
