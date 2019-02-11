package com.gzucm.fuck_his.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author tianyi
 * @date 2018-10-22 19:03
 */
public class TestRunUtil {

    public static void main(String[] args){
//        System.out.println(TimestampUtil.getAgeStringFromTimaStamp(1506078268L));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            date = df.parse("1970-09-30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();
        System.out.println(timestamp/1000);
    }
}
