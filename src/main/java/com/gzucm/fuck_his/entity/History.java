package com.gzucm.fuck_his.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author tianyi
 * @date 2018-10-19 10:01
 */
@Data
@Entity
public class History {
    @Id
    @GeneratedValue
    private int id;

    public History(NotNullArgs args){
        this.patientId = args.patientId;
        this.doctorId = args.doctorId;
        this.judge = args.judge;
        this.mainTold = args.mainTold;
        this.medicines = args.medicines;
        this.price = args.price;
    }

    @AllArgsConstructor
    static public class NotNullArgs{
        private int patientId;

        private int doctorId;

        private String judge;

        private String mainTold;

        private String medicines;

        private double price;
    }

    @NotNull
    private int patientId;

    @NotNull
    private int doctorId;

    @NotBlank
    private String judge;

    @NotBlank
    private String mainTold;

    @NotBlank
    private String medicines;

    @NotNull
    private double price;

    private boolean isPaid = false;

    private long createTime = System.currentTimeMillis();
}
