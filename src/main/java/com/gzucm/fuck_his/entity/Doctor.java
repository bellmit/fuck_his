package com.gzucm.fuck_his.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author tianyi
 * @date 2018-10-19 10:00
 */
@Data
@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private int id;

    public Doctor(NotNullArgs args,boolean sex){
        this.apartmentId = args.apartmentId;
        this.name = args.name;
        this.phonenumber = args.phonenumber;
        this.password = args.password;
        this.level = args.level;
        this.introduction = args.introduction;
        this.workKind = args.workKind;
        this.isMan = sex;
    }

    @AllArgsConstructor
    static public class NotNullArgs{
        private String name;

        private String phonenumber;

        private String password;

        private String level;

        private String introduction;

        private int workKind;

        private double apartmentId;
    }


    @NotBlank
    private String name;

    @NotBlank
    private String phonenumber;

    @NotBlank
    private String password;

    @NotBlank
    private String level;

    @NotBlank
    private String introduction;

    @NotNull
    private int workKind;

    @NotNull
    private double apartmentId;

    private boolean isMan = true;

    private int monthPeople = 0;

}
