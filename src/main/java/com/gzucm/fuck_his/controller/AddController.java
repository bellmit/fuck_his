package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.entity.Patient;
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
 * @date 2018-10-19 10:59
 */
@RestController
@RequestMapping("/add")
public class AddController {

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
     * @api {post} /add/patient 添加病人
     * @apiGroup Patient
     * @apiParam {String} name 病人姓名
     * @apiParam {boolean} sex 病人性别（若bool类型传输有问题可以改）
     * @apiParam {String} password 密码
     * @apiParam {String} phonenumber 手机号
     * @apiParam {String} peopleCard 身份证号（可以考虑用这个来自动生成生日信息）
     * @apiParam {String} healthCardId 诊疗卡号
     * @apiParam {long} birthday 生日时间戳（10位）
     * @apiParam {double} height 身高
     * @apiParam {double} weight 体重
     * @apiParam {String} address 病人住址
     * @apiParam {String} allergy 过敏药物
     * @apiSuccessExample Success-Request:
     * {
     *     name:王C明
    sex:true
    password:1234
    phonenumber:18320445000
    peopleCard:441781199700000000
    healthCardId:7382649975
    birthday:1234567890
    height:188.0
    weight:68.
    address:111111
    allergy:111111
     * }
     * @apiUse CommonDTO
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
    "healthCardId": "7382649975",
    "peopleCard": "441781199700000000",
    "cureTimes": 0,
    "man": true
    }
     * }
     */
    @PostMapping("/patient")
    public CommonDTO addPatient(String name, boolean sex, String password, String phonenumber,
                         String peopleCard, String healthCardId, Long birthday,
                         Double height, Double weight,String address,String allergy) {
        return patientService.add(name,sex,password,phonenumber,peopleCard,healthCardId,birthday,height,weight,address,allergy);
    }
    /**
     * @api {post} /add/doctor 添加医生
     * @apiGroup Doctor
     * @apiParam {String} name 医生姓名
     * @apiParam {boolean} sex 医生性别（若bool类型传输有问题可以改）
     * @apiParam {String} password 密码
     * @apiParam {String} phonenumber 手机号
     * @apiParam {double} appartmentId 科室代号[大类.小类]
     * @apiParam {int} workKind 值班类型（上什么班）
     * @apiParam {String} introduction 医生简介
     * @apiParam {String} level 医生职称
     * @apiSuccessExample Success-Request:
     * {
     *     name:李小豪
    sex:true
    password:1234
    phonenumber:18320444515
    //id:2
    apartmentId:1
    workKind:1
    introduction:我叫李大豪，是个医生，我爱治病救人
    level:实习医师
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 4,
    "name": "李小豪",
    "phonenumber": "18320444515",
    "password": "1234",
    "level": "实习医师",
    "introduction": "我叫李大豪，是个医生，我爱治病救人",
    "workKind": 1,
    "apartmentId": 1,
    "monthPeople": 0,
    "man": true
    }
     * }
     */
    @PostMapping("/doctor")
    public CommonDTO addDoctor(String name,boolean sex,String password,String phonenumber,
                               Double apartmentId,Integer workKind,String introduction,String level){
        return doctorService.add(name,sex,password,phonenumber,apartmentId,workKind,introduction,level);
    }

    /**
     * @api {post} /add/apartment 添加科室
     * @apiGroup Apartment
     * @apiParam {String} name 科室名称
     * @apiParam {String} introduction 科室简介
     * @apiParam {double} apartmentId 科室代号[大类.小类]
     * @apiSuccessExample Success-Request:
     * {
     *     name:急诊
    introduction:这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看
    apartmentId:1
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
    @PostMapping("/apartment")
    public CommonDTO addApartment(String name,String introduction,double apartmentId){
        return apartmentService.add(name,introduction,apartmentId);
    }

    /**
     * @api {post} /add/history 添加就诊历史（病历）
     * @apiGroup History
     * @apiParam {int} patientId 病人id
     * @apiParam {int} doctorId 医生id
     * @apiParam {String} judge 主症（医生判断）
     * @apiParam {String} mainTold 主诉（患者自己说哪里不舒服）
     * @apiParam {String} medicines 药物清单
     * @apiParam {double} price 药价
     * @apiSuccessExample Success-Request:
     * {
     *     patientId:2
    doctorId:10
    judge:急性肠胃炎
    mainTold:肚子不舒服，头晕想呕，很难受
    medicines:藿香正气液、阿莫西林胶囊
    price:20.0
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
    "isPaid": 0,
    "createTime": 1540045791968
    }
     * }
     */
    @PostMapping("/history")
    public CommonDTO addHistory(int patientId, int doctorId, String judge, String mainTold,
                                String medicines, double price){
        return historyService.add(patientId,doctorId,judge,mainTold,medicines,price);
    }
}
