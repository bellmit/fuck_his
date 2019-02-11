package com.gzucm.fuck_his.service.impl;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.entity.History;
import com.gzucm.fuck_his.repository.HistoryRepository;
import com.gzucm.fuck_his.service.BasicCURD;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2018-10-19 16:05
 */
@Service
public class HistoryService{

    @Autowired
    private HistoryRepository historyRepository;


    /**
     * 添加记录
     *
     * @return
     */
    public CommonDTO add(int patientId, int doctorId, String judge, String mainTold,
                         String medicines, double price) {
        History history = new History(new History.NotNullArgs(patientId,doctorId,judge,mainTold,medicines,price));
        return CommonDTOUtil.success(historyRepository.save(history));
    }

    /**
     * 删除记录
     *
     * @return
     */
    public CommonDTO delete(int historyId) {
        try {
            historyRepository.deleteById(historyId);
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
    public CommonDTO update(int historyId,int patientId, int doctorId,
                            String judge, String mainTold, String medicines, double price) {
        try {
            History history = historyRepository.findById(historyId).get();
            if (patientId != 0){
                history.setPatientId(patientId);
            }
            if (doctorId != 0){
                history.setDoctorId(doctorId);
            }
            if (!judge.equals("")){
                history.setJudge(judge);
            }
            if (!mainTold.equals("")){
                history.setMainTold(mainTold);
            }
            if (!medicines.equals("")){
                history.setMedicines(medicines);
            }
            if (price != 0.0){
                history.setPrice(price);
            }
            return CommonDTOUtil.success(historyRepository.saveAndFlush(history));
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
        return CommonDTOUtil.success(historyRepository.findAllSafe());
    }

    /**
     * 单个搜索
     * @param historyId
     * @return
     */
    public CommonDTO findOne(int historyId) {
        return CommonDTOUtil.success(historyRepository.findById(historyId));
    }
}
