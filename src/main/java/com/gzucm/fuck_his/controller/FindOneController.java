package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.DTO.PatientDTO;
import com.gzucm.fuck_his.service.impl.ApartmentService;
import com.gzucm.fuck_his.service.impl.DoctorService;
import com.gzucm.fuck_his.service.impl.HistoryService;
import com.gzucm.fuck_his.service.impl.PatientService;
import com.gzucm.fuck_his.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @author tianyi
 * @date 2018-10-22 20:01
 */
@RestController
@RequestMapping("/find")
public class FindOneController {

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
     *  @apiDefine PatientDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     *  @apiSuccess {String} ageString 描述年龄的文字
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
     * @api {get} /find/patient 搜索病人
     * @apiGroup Patient
     * @apiParam {int} id 病人id
     * @apiSuccessExample Success-Request:
     * {
     *     ?id=3
     * }
     * @apiUse PatientDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 3,
    "name": "王小明",
    "phonenumber": "18320444515",
    "password": "1234",
    "birthday": 1234567890,
    "height": 188,
    "weight": 68,
    "address": null,
    "healthCardId": "7382649975",
    "peopleCard": "441781199700000000",
    "allergy": null,
    "cureTimes": 0,
    "man": true
    },
    "ageString": "9岁9月"
     * }
     */
    @GetMapping("/patient")
    public PatientDTO findPatient(@RequestParam(name = "id")int patientId){
        return patientService.findOne(patientId);
    }

    /**
     * @api {get} /find/doctor 搜索医生
     * @apiGroup Doctor
     * @apiParam  {int} id 医生id
     * @apiSuccessExample Success-Request:
     * {
     *     ?id=4
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 4,
    "name": "李小豪",
    "phonenumber": "18320444511",
    "password": "abc1234",
    "level": "实习医师",
    "introduction": "我叫李小豪，是个医生，我爱治病救人",
    "workKind": 2,
    "apartmentId": 1,
    "monthPeople": 0,
    "man": true
    }
     * }
     */
    @GetMapping("/doctor")
    public CommonDTO findDoctor(@RequestParam(name = "id")int doctorId){
        return doctorService.findOne(doctorId);
    }

    /**
     * @api {get} /find/apartment 搜索部门
     * @apiGroup Apartment
     * @apiParam {int} id 科室id
     * @apiSuccessExample Success-Request:
     * {
     *     ?id=11
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 11,
    "apartmentName": "急诊",
    "introduction": "这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看",
    "apartmentId": 1
    }
     * }
     */
    @GetMapping("/apartment")
    public CommonDTO findApartment(@RequestParam(name = "id")int apartmentId){
        return apartmentService.findOne(apartmentId);
    }

    /**
     * @api {get} /find/history 搜索就诊记录
     * @apiGroup History
     * @apiParam {int} id 病历id
     * @apiSuccessExample Success-Request:
     * {
     *     ?id=13
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 13,
    "patientId": 2,
    "doctorId": 10,
    "judge": "急性肠胃炎",
    "mainTold": "肚子不舒服，头晕想呕，很难受",
    "medicines": "藿香正气液、阿莫西林胶囊",
    "price": 20,
    "createTime": 1540045791968,
    "paid": false
    }
     * }
     */
    @GetMapping("/history")
    public CommonDTO findHitory(@RequestParam(name = "id")int historyId){
        return historyService.findOne(historyId);
    }
}
