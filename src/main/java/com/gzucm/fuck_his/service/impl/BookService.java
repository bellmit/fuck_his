package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.constant.RedisContant;
import com.gzucm.fuck_his.service.Bookable;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author tianyi
 * @date 2018-10-26 00:02
 */
@Service
public class BookService implements Bookable{

    @Autowired
    private RedisQueueService redisQueueService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 病人预约
     *
     * @param healthCard
     * @param patientId
     * @param doctorId
     * @return
     */
    @Override
    public CommonDTO book(String healthCard, int patientId, int doctorId) {
        String cacheName = healthCard;
        String cacheValue = String.format(RedisContant.BOOK_FORMAT, String.valueOf(patientId), String.valueOf(doctorId));
        redisTemplate.opsForValue().set(cacheName, cacheValue, RedisContant.EXPIRE, TimeUnit.SECONDS);
        return CommonDTOUtil.success();
    }

    /**
     * 预约报到
     *
     * @param healthCard
     * @return
     */
    @Override
    public CommonDTO comfirm(String healthCard) {
        String cacheValue = redisTemplate.opsForValue().get(healthCard);
        return redisQueueService.patientBooking(Integer.parseInt(cacheValue.split("_")[0]),
                Integer.parseInt(cacheValue.split("_")[1]));
    }

    public CommonDTO findByCard(String healthCard){
        String cacheValue = redisTemplate.opsForValue().get(healthCard);
        redisQueueService.patientBooking(Integer.parseInt(cacheValue.split("_")[0]),
                Integer.parseInt(cacheValue.split("_")[1]));
        redisTemplate.delete(healthCard);
        return CommonDTOUtil.success(cacheValue.split("_"));
    }
}
