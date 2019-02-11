package com.gzucm.fuck_his.DTO;

import com.gzucm.fuck_his.entity.Patient;
import lombok.Data;

/**
 * @author tianyi
 * @date 2018-10-22 18:28
 */
@Data
public class PatientDTO<T> {
    /** 错误码. */
    private Integer resultCode;

    /** 提示信息. */
    private String resultMsg;

    /** 具体内容. */
    private T data;

    /** 年龄字符串. */
    private String ageString;
}
