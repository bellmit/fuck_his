package com.gzucm.fuck_his.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author tianyi
 * @date 2018-10-19 10:01
 */
@Data
@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private int id;

    public Apartment(String apartmentName, String introduction, double apartmentId){
        this.apartmentName = apartmentName;
        this.introduction = introduction;
        this.apartmentId = apartmentId;
    }

    @NotBlank
    private String apartmentName;

    @NotBlank
    private String introduction;

    @NotNull
    private double apartmentId;

    @Override
    public String toString(){
        return "{\""+this.getClass().toString()+"\":{\"introduction\":\""+this.introduction+"\"}}";
    }
}
