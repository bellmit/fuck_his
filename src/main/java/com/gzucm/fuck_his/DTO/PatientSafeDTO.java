package com.gzucm.fuck_his.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author tianyi
 * @date 2018-10-23 21:45
 */
@Data
public class PatientSafeDTO {

    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String phonenumber;

    @NotNull
    private long birthday;

    @NotNull
    private double height;

    @NotNull
    private double weight;

    private String address;

    @NotBlank
    private String healthCardId;

    @NotBlank
    private String peopleCard;

    private String allergy;

    private boolean isMan = true;

    private int cureTimes = 0;
}
