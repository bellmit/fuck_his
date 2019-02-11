package com.gzucm.fuck_his.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 患者信息表，一次注册，多次调用
 * @author tianyi
 * @date 2018-10-19 10:00
 */
@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    public Patient(NotNullArgs args,boolean sex){
        this.birthday = args.birthday;
        this.name = args.name;
        this.healthCardId = args.healthCardId;
        this.phonenumber = args.phonenumber;
        this.password = args.password;
        this.peopleCard = args.peopleCard;
        this.weight = args.weight;
        this.height = args.height;
        this.isMan = sex;
        this.address = args.address;
        this.allergy = args.allergy;
    }

    @AllArgsConstructor
    static public class NotNullArgs{
        @NotBlank
        private String name;

        @NotBlank
        private String phonenumber;

        @NotBlank
        private String password;

        @NotNull
        private long birthday;

        @NotNull
        private double height;

        @NotNull
        private double weight;

        @NotBlank
        private String healthCardId;

        @NotBlank
        private String peopleCard;

        @NotBlank
        private String address;

        @NotBlank
        private String allergy;
    }


    @NotBlank
    private String name;

    @NotBlank
    private String phonenumber;

    @NotBlank
    private String password;

    @NotNull
    private long birthday;

    @NotNull
    private double height;

    @NotNull
    private double weight;

    @NotBlank
    private String address;

    @NotBlank
    private String healthCardId;

    @NotBlank
    private String peopleCard;

    @NotBlank
    private String allergy;

    private boolean isMan = true;

    private int cureTimes = 0;
}
