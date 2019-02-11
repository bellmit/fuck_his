package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.DTO.PatientDTO;
import com.gzucm.fuck_his.service.impl.DoctorService;
import com.gzucm.fuck_his.service.impl.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-22 18:41
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

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
     * @api {post} /login/patient 病人登录
     * @apiGroup Patient
     * @apiParam {String} phonenumber 手机号
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     *     password:1234
    phonenumber:18320444515
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
    @PostMapping("/patient")
    public PatientDTO patientLogin(String phonenumber, String password){
        return patientService.loginP(phonenumber,password);
    }

    /**
     * @api {post} /login/doctor 医生登录
     * @apiGroup Doctor
     * @apiParam {String} phonenumber 手机号
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     *     password:abc1234
    phonenumber:18320444511
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
    @PostMapping("/doctor")
    public CommonDTO doctorLogin(String phonenumber, String password){
        return doctorService.login(phonenumber,password);
    }
}
