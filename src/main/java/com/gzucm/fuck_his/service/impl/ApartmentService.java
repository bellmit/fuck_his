package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.entity.Apartment;
import com.gzucm.fuck_his.repository.ApartmentRepository;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2018-10-19 21:16
 */
@Service
public class ApartmentService{
    @Autowired
    private ApartmentRepository apartmentRepository;

    /**
     * 添加记录
     *
     * @return
     */
    public CommonDTO add(String name,String introduction,double apartmentId) {
        return CommonDTOUtil.success(apartmentRepository.save(new Apartment(name,introduction,apartmentId)));
    }

    /**
     * 删除记录
     *
     * @return
     */
    public CommonDTO delete(int id) {
        try {
            apartmentRepository.deleteById(id);
            return CommonDTOUtil.success();
        }catch (Exception e){
            return CommonDTOUtil.error(444,e.getMessage());
        }

    }

    /**
     * 更新记录
     *
     * @return
     */
    public CommonDTO update(int id,String name,String introduction,double apartmentId) {
        try {
            Apartment apartment = apartmentRepository.findById(id).get();
            if (!name.equals("")){
                apartment.setApartmentName(name);
            }
            if (!introduction.equals("")){
                apartment.setIntroduction(introduction);
            }
            if (apartmentId != 0.0){
                apartment.setApartmentId(apartmentId);
            }
            return CommonDTOUtil.success(apartmentRepository.saveAndFlush(apartment));
        }catch (Exception e){
            return CommonDTOUtil.error(444,e.getMessage());
        }

    }

    /**
     * 获取列表
     *
     * @return
     */
    public CommonDTO getList() {
        return CommonDTOUtil.success(apartmentRepository.findAll());
    }

    /**
     * 单个搜索
     * @param apartmentId
     * @return
     */
    public CommonDTO findOne(int apartmentId) {
        return CommonDTOUtil.success(apartmentRepository.findById(apartmentId));
    }
}
