package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.service.impl.ApartmentService;
import com.gzucm.fuck_his.service.impl.DoctorService;
import com.gzucm.fuck_his.service.impl.HistoryService;
import com.gzucm.fuck_his.service.impl.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-19 22:41
 */
@RestController
@RequestMapping("/update")
public class UpdateController {

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
     * @api {post} /update/patient 修改病人信息
     * @apiGroup Patient
     * @apiParam {int} id 病人id【不可为空】
     * @apiParam {String} name 病人姓名[可空]
     * @apiParam {boolean} sex 病人性别（若bool类型传输有问题可以改）【最好不要空，默认true=男】
     * @apiParam {String} password 密码[可空]
     * @apiParam {String} phonenumber 手机号[可空]
     * @apiParam {String} peopleCard 身份证号（可以考虑用这个来自动生成生日信息）[可空]
     * @apiParam {String} healthCardId 诊疗卡号[可空]
     * @apiParam {long} birthday 生日时间戳[可空]
     * @apiParam {double} height 身高[可空]
     * @apiParam {double} weight 体重[可空]
     * @apiParam {String} address 病人住址[可空]
     * @apiParam {String} allergy 过敏药物[可空]
     * @apiSuccessExample Success-Request:
     * {
     *     sex:false
    id:15
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 15,
    "name": "王小红",
    "phonenumber": "18320444515",
    "password": "1234",
    "birthday": 1234567890,
    "height": 188,
    "weight": 68,
    "address": "广州中医药大学三元里校区宿舍0栋-404",
    "healthCardId": "7382649975",
    "peopleCard": "441781199700000000",
    "allergy": "酒精、海鲜",
    "cureTimes": 0,
    "man": false
    }
     * }
     */
    @PostMapping("/patient")
    public CommonDTO updatePatient(@RequestParam(value="id",required=true,defaultValue="0")int patientId,
                                   @RequestParam(value="name",required=false,defaultValue="")String name,
                                   @RequestParam(value="sex",required=false,defaultValue="true")boolean sex,
                                   @RequestParam(value="password",required=false,defaultValue="")String password,
                                   @RequestParam(value="phonenumber",required=false,defaultValue="")String phonenumber,
                                   @RequestParam(value="peopleCard",required=false,defaultValue="")String peopleCard,
                                   @RequestParam(value="healthCardId",required=false,defaultValue="")String healthCardId,
                                   @RequestParam(value="birthday",required=false,defaultValue="0")long birthday,
                                   @RequestParam(value="height",required=false,defaultValue="0.0")double height,
                                   @RequestParam(value="weight",required=false,defaultValue="0.0")double weight,
                                   @RequestParam(value="address",required=false,defaultValue="")String address,
                                   @RequestParam(value="allergy",required=false,defaultValue="")String allergy){
        return patientService.update(patientId,name,sex,password,phonenumber,peopleCard,healthCardId,birthday,height,weight,address,allergy);
    }
    /**
     * @api {post} /update/doctor 修改医生信息
     * @apiGroup Doctor
     * @apiParam {int} id 医生id【不可为空】
     * @apiParam {String} name 医生姓名[可空]
     * @apiParam {boolean} sex 医生性别（若bool类型传输有问题可以改）【最好不要空，默认true=男】
     * @apiParam {String} password 密码[可空]
     * @apiParam {String} phonenumber 手机号[可空]
     * @apiParam {double} appartmentId 科室代号[可空][大类.小类]
     * @apiParam {int} workKind 值班类型（上什么班）[可空]
     * @apiParam {String} introduction 医生简介[可空]
     * @apiParam {String} level 医生职称[可空]
     * @apiSuccessExample Success-Request:
     * {
     *     id:4
    introduction:我叫李小豪，是个医生，我爱治病救人
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
    public CommonDTO updateDoctor(@RequestParam(value="id",required=true,defaultValue="0")int doctorId,
                                  @RequestParam(value="name",required=false,defaultValue="")String name,
                                  @RequestParam(value="sex",required=false,defaultValue="true")boolean sex,
                                  @RequestParam(value="password",required=false,defaultValue="")String password,
                                  @RequestParam(value="phonenumber",required=false,defaultValue="")String phonenumber,
                                  @RequestParam(value="apartmentId",required=false,defaultValue="0.0")double apartmentId,
                                  @RequestParam(value="workKind",required=false,defaultValue="0")int workKind,
                                  @RequestParam(value="introduction",required=false,defaultValue="")String introduction,
                                  @RequestParam(value="level",required=false,defaultValue="")String level){
        return doctorService.update(doctorId,name,sex,password,phonenumber,apartmentId,workKind,introduction,level);
    }

    /**
     * @api {post} /update/apartment 修改科室信息
     * @apiGroup Apartment
     * @apiParam {int} id 科室id【不可为空】
     * @apiParam {String} name 科室名称[可空]
     * @apiParam {String} introduction 科室简介[可空]
     * @apiParam {double} apartmentId 科室代号[可空][大类.小类]
     * @apiSuccessExample Success-Request:
     * {
     *     introduction:这里是妇产科，每天都有很多小新生命在这里诞生
    id:12
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 12,
    "apartmentName": "妇产科",
    "introduction": "这里是妇产科，每天都有很多小新生命在这里诞生",
    "apartmentId": 2
    }
     * }
     */
    @PostMapping("/apartment")
    public CommonDTO updateApartment(@RequestParam(value="id",required=true,defaultValue="0")int id,
                                     @RequestParam(value="name",required=false,defaultValue="")String name,
                                     @RequestParam(value="introduction",required=false,defaultValue="")String introduction,
                                     @RequestParam(value="apartmentId",required=false,defaultValue="0")double apartmentId){
        return apartmentService.update(id,name,introduction,apartmentId);
    }

    /**
     * @api {post} /add/history 修改就诊历史（病历）
     * @apiGroup History
     * @apiParam {int} id 病历id【不可为空】
     * @apiParam {int} patientId 病人id[可空]
     * @apiParam {int} doctorId 医生id[可空]
     * @apiParam {String} judge 主症（医生判断）[可空]
     * @apiParam {String} mainTold 主诉（患者自己说哪里不舒服）[可空]
     * @apiParam {String} medicines 药物清单[可空]
     * @apiParam {double} price 药价[可空]
     * @apiSuccessExample Success-Request:
     * {
     *     mainTold:运动后的第二天全身酸痛，动弹不得
    id:14
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 14,
    "patientId": 3,
    "doctorId": 4,
    "judge": "运动造成的乳酸堆积",
    "mainTold": "运动后的第二天全身酸痛，动弹不得",
    "medicines": "水杨酸甲酯软膏",
    "price": 15,
    "isPaid": 0,
    "createTime": 1540045916590
    }
     * }
     */
    @PostMapping("/history")
    public CommonDTO updateHistory(@RequestParam(value="id",required=true,defaultValue="0")int historyId,
                                   @RequestParam(value="patientId",required=false,defaultValue="0")int patientId,
                                   @RequestParam(value="doctorId",required=false,defaultValue="0")int doctorId,
                                   @RequestParam(value="judge",required=false,defaultValue="")String judge,
                                   @RequestParam(value="mainTold",required=false,defaultValue="")String mainTold,
                                   @RequestParam(value="medicines",required=false,defaultValue="")String medicines,
                                   @RequestParam(value="price",required=false,defaultValue="0.0")double price){
        return historyService.update(historyId,patientId,doctorId,judge,mainTold,medicines,price);
    }
}
