package com.gzucm.fuck_his.service;

import com.gzucm.fuck_his.DTO.CommonDTO;

/**
 * @author tianyi
 * @date 2018-10-22 18:31
 */
public interface RedisQueue {

    /**
     * 获取消息队列（获取所有redis队列）
     * @param doctorId
     * @return
     */
    public CommonDTO getQueue(int doctorId);

    /**
     * 呼唤下一个病人（获取队列头部的第一个病人）
     * @param doctorId
     * @return
     */
    public CommonDTO callNext(int doctorId);

    /**
     * 病人挂号（存信息进redis）
     * @param patientId 病人id
     * @param doctorId 医生id
     * @return
     */
    public CommonDTO patientBooking(int patientId, int doctorId);
}
