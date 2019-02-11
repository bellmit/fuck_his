package com.gzucm.fuck_his.utils;

/**
 * @author tianyi
 * @date 2018-10-25 05:01
 */
public class StringUtil {
    public static String refreshSplit(String[] split) {
        StringBuffer rt = new StringBuffer("");
        for (int i=1; i<split.length; i++){
            if (i==1){
                rt.append(split[i]);
            }else{
                rt.append("_"+split[i]);
            }
        }
        return rt.toString();
    }
}
