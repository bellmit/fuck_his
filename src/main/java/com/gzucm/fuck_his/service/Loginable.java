package com.gzucm.fuck_his.service;

import com.gzucm.fuck_his.DTO.CommonDTO;

/**
 * @author tianyi
 * @date 2018-10-19 11:17
 */
public interface Loginable {
    /**
     * 登录
     * @param phonenumber
     * @param password 可补加加密
     * @return
     */
    public CommonDTO login(String phonenumber, String password);
}
