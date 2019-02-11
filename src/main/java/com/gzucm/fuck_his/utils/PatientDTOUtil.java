package com.gzucm.fuck_his.utils;

import com.gzucm.fuck_his.DTO.PatientDTO;
import com.gzucm.fuck_his.DTO.PatientSafeDTO;
import com.gzucm.fuck_his.entity.Patient;

import java.lang.reflect.Field;

/**
 * @author tianyi
 * @date 2018-10-22 20:06
 */
public class PatientDTOUtil {

    public static PatientDTO success(Object object) throws Exception {
        PatientDTO rt=new PatientDTO();
        rt.setResultCode(200);
        rt.setResultMsg("成功");
        System.out.println(object.getClass().getName());
        if(object.getClass().getName().equals("com.gzucm.fuck_his.entity.Patient")){
//            System.out.println("++++++++++++++++++++++");
            if (object != null) {
                Patient patient = (Patient) object;
                rt.setData(patient);
                rt.setAgeString(TimestampUtil.getAgeStringFromTimaStamp(patient.getBirthday()));
            }else {
                rt.setData(object);
                rt.setAgeString("");
            }
        }else if (object.getClass().getName().equals("com.gzucm.fuck_his.DTO.PatientSafeDTO")){
            if (object != null) {
                System.out.println(object.toString());
                PatientSafeDTO patient = (PatientSafeDTO) object;
                rt.setData(object);
                rt.setAgeString(TimestampUtil.getAgeStringFromTimaStamp(patient.getBirthday()));
            }else {
                rt.setData(object);
                rt.setAgeString("");
            }
        }else {
            rt.setData(object);
            rt.setAgeString("");
        }

        return rt;
    }

    public static PatientDTO success() throws Exception {return success(null);}

    public static PatientDTO error(Integer code, String msg){
        PatientDTO rt=new PatientDTO();
        rt.setResultCode(code);
        rt.setResultMsg(msg);
        rt.setData(null);
        return rt;
    }

}
