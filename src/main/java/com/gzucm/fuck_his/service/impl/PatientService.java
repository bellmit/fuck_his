package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.DTO.PatientDTO;
import com.gzucm.fuck_his.entity.Patient;
import com.gzucm.fuck_his.repository.PatientRepository;
import com.gzucm.fuck_his.service.BasicCURD;
import com.gzucm.fuck_his.service.Loginable;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import com.gzucm.fuck_his.utils.PatientDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2018-10-19 10:36
 */
@Service
public class PatientService{

    @Autowired
    private PatientRepository patientRepository;

    /**
     * 添加记录
     *
     * @return
     */
    public CommonDTO add(String name,boolean sex,String password,String phonenumber,
                         String peopleCard, String healthCardId, long birthday,
                         double height, double weight,String address,String allergy) {
        Patient patient = new Patient(new Patient.NotNullArgs(name,phonenumber,password,birthday,height,weight,healthCardId,peopleCard,address,allergy),sex);
        return CommonDTOUtil.success(patientRepository.save(patient));
    }

    /**
     * 删除记录
     *
     * @return
     */
    public CommonDTO delete(int patientId) {
        try {
            patientRepository.deleteById(patientId);
            return CommonDTOUtil.success();
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * 更新记录
     *
     * @return
     */
    public CommonDTO update(int patientId,String name,boolean sex,String password,String phonenumber,
                            String peopleCard, String healthCardId, long birthday,
                            double height, double weight,String address,String allergy) {
        try {
            Patient patient = patientRepository.findById(patientId).get();
            if (!name.equals("")) {
                patient.setName(name);
            }
            if (!address.equals("")){
                patient.setAddress(address);
            }
            if (!allergy.equals("")){
                patient.setAllergy(allergy);
            }
            patient.setMan(sex);
            if (!password.equals("")) {
                patient.setPassword(password);
            }
            if (!phonenumber.equals("")) {
                patient.setPhonenumber(phonenumber);
            }
            if (!peopleCard.equals("")) {
                patient.setPeopleCard(peopleCard);
            }
            if (!healthCardId.equals("")) {
                patient.setHealthCardId(healthCardId);
            }
            if (birthday!=0) {
                patient.setBirthday(birthday);
            }
            if (weight!=0.0) {
                patient.setWeight(weight);
            }
            if (height!=0.0) {
                patient.setHeight(height);
            }
            return CommonDTOUtil.success(patientRepository.saveAndFlush(patient));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * 获取列表
     *
     * @return
     */
    public CommonDTO getList() {
        return CommonDTOUtil.success(patientRepository.findAll());
    }

    /**
     * 登录
     * @param phonenumber
     * @param password    可补加加密
     * @return
     */
    public PatientDTO loginP(String phonenumber, String password) {
        try {
            Patient patient = patientRepository.findAllByPhonenumber(phonenumber).get(0);
            if (patient.getPassword().equals(password)){
                return PatientDTOUtil.success(patient);
            }else{
                return PatientDTOUtil.error(444,"密码错误");
            }

        }catch (Exception e){
            return PatientDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * 单个搜索
     * @param patientId
     * @return
     */
    public PatientDTO findOne(int patientId){
        try {
//            return PatientDTOUtil.success(patientRepository.findOneByIdSafe(patientId).iterator().next());
            return PatientDTOUtil.success(patientRepository.findById(patientId).get());
        } catch (Exception e) {
            e.printStackTrace();
            return PatientDTOUtil.error(500,e.getMessage());
        }
    }
}
