package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.service.impl.ApartmentService;
import com.gzucm.fuck_his.service.impl.DoctorService;
import com.gzucm.fuck_his.service.impl.HistoryService;
import com.gzucm.fuck_his.service.impl.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-19 23:08
 */
@RestController
@RequestMapping("/delete")
public class DeleteController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private ApartmentService apartmentService;

    @Autowired
    private HistoryService historyService;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     * @apiDefine Patient 病人
     */
    /**
     * @apiDefine Doctor 医生
     */
    /**
     * @apiDefine Apartment 科室
     */
    /**
     * @apiDefine History 病历（就诊历史）
     */
    /**
     * @api {post} /delete/patient 删除病人
     * @apiGroup Patient
     * @apiParam {int} patientId 病人id
     * @apiSuccessExample Success-Request:{
     *     patientId:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": null
     * }
     */
    @PostMapping("/patient")
    public CommonDTO deletePatient(int patientId){
        return patientService.delete(patientId);
    }

    /**
     * @api {post} /delete/doctor 删除医生
     * @apiGroup Doctor
     * @apiParam {int} doctorId 医生id
     * @apiSuccessExample Success-Request:{
     *     doctorId:10
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": null
     * }
     */
    @PostMapping("/doctor")
    public CommonDTO deleteDoctor(int doctorId){
        return doctorService.delete(doctorId);
    }

    /**
     * @api {post} /delete/apartment 删除科室
     * @apiGroup Apartment
     * @apiParam {int} apartmentId 科室id
     * @apiSuccessExample Success-Request:{
     *     apartmentId:12
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": null
     * }
     */
    @PostMapping("/apartment")
    public CommonDTO deleteApartment(int apartmentId){
        return apartmentService.delete(apartmentId);
    }

    /**
     * @api {post} /delete/history 删除就诊历史（病历）
     * @apiGroup History
     * @apiParam {int} historyId 病历id
     * @apiSuccessExample Success-Request:{
     *     historyId:14
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": null
     * }
     */
    @PostMapping("/history")
    public CommonDTO deleteHistory(int historyId){
        return historyService.delete(historyId);
    }
}
