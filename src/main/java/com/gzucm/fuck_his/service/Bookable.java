package com.gzucm.fuck_his.service;

import com.gzucm.fuck_his.DTO.CommonDTO;

/**
 * @author tianyi
 * @date 2018-10-25 23:56
 */
public interface Bookable {

    /**
     * 病人预约
     * @param healthCard
     * @param patientId
     * @param doctorId
     * @return
     */
    public CommonDTO book(String healthCard,int patientId, int doctorId);

    /**
     * 预约报到
     * @param healthCard
     * @return
     */
    public CommonDTO comfirm(String healthCard);

}
