package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.entity.Doctor;
import com.gzucm.fuck_his.entity.Patient;
import com.gzucm.fuck_his.repository.DoctorRepository;
import com.gzucm.fuck_his.service.BasicCURD;
import com.gzucm.fuck_his.service.Loginable;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;

/**
 * @author tianyi
 * @date 2018-10-19 12:22
 */
@Service
public class DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    /**
     * 添加记录
     *
     * @return
     */
    public CommonDTO add(String name,boolean sex,String password,String phonenumber,
                         double apartmentId,int workKind,String introduction,String level) {
        Doctor doctor = new Doctor(new Doctor.NotNullArgs(name,phonenumber,password,level,introduction,workKind,apartmentId),sex);
        return CommonDTOUtil.success(doctorRepository.save(doctor));
    }

    /**
     * 删除记录
     *
     * @return
     */
    public CommonDTO delete(int doctorId) {
        try {
            doctorRepository.deleteById(doctorId);
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
    public CommonDTO update(int doctorId,String name,boolean sex,String password,String phonenumber,
                            double apartmentId,int workKind,String introduction,String level) {
        Doctor doctor = doctorRepository.findById(doctorId).get();
        if (!name.equals("")){
            doctor.setName(name);
        }
        doctor.setMan(sex);
        if (!password.equals("")){
            doctor.setPassword(password);
        }
        if (!phonenumber.equals("")){
            doctor.setPhonenumber(phonenumber);
        }
        if (apartmentId != 0.0) {
            doctor.setApartmentId(apartmentId);
        }
        if (workKind != 0){
            doctor.setWorkKind(workKind);
        }
        if (!introduction.equals("")){
            doctor.setIntroduction(introduction);
        }
        if (!level.equals("")){
            doctor.setLevel(level);
        }
        return CommonDTOUtil.success(doctorRepository.saveAndFlush(doctor));
    }

    /**
     * 获取列表
     *
     * @return
     */
    public CommonDTO getList() {
        return CommonDTOUtil.success(doctorRepository.findAllSafe());
    }

    /**
     * 登录
     *
     * @param phonenumber
     * @param password    可补加加密
     * @return
     */
    public CommonDTO login(String phonenumber, String password) {
        try {
            Doctor doctor = doctorRepository.findByPhonenumber(phonenumber);
            if (doctor.getPassword().equals(password)){
                return CommonDTOUtil.success(doctor);
            }else{
                return CommonDTOUtil.error(444,"密码错误");
            }

        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * 单个搜索
     * @param patientId
     * @return
     */
    public CommonDTO findOne(int patientId){
//        return CommonDTOUtil.success(doctorRepository.findOneByIdSafe(patientId));
        return CommonDTOUtil.success(doctorRepository.findById(patientId).get());
    }
}
