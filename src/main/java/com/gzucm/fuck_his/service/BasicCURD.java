package com.gzucm.fuck_his.service;

import com.gzucm.fuck_his.DTO.CommonDTO;

/**
 * @author tianyi
 * @date 2018-10-19 10:33
 */
public interface BasicCURD {
    /**
     * 添加记录
     * @return
     */
    public CommonDTO add();

    /**
     * 删除记录
     * @return
     */
    public CommonDTO delete();

    /**
     * 更新记录
     * @return
     */
    public CommonDTO update();

    /**
     * 获取列表
     * @return
     */
    public CommonDTO getList();
}
