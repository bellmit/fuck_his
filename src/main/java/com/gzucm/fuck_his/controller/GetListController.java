package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.service.impl.ApartmentService;
import com.gzucm.fuck_his.service.impl.DoctorService;
import com.gzucm.fuck_his.service.impl.HistoryService;
import com.gzucm.fuck_his.service.impl.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-19 23:13
 */
@RestController
@RequestMapping("/list")
public class GetListController {
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
     * @api {get} /list/patient 获取所有病人 TODO 改示例
     * @apiGroup Patient
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    [
    3,
    1234567890,
    "王小明",
    "18320444515",
    true,
    188,
    68,
    "7382649975",
    "441781199700000000",
    0
    ],
    [
    2,
    1234567890,
    "王小凤",
    "18320444515",
    true,
    188,
    68,
    "7382649975",
    "441781199700000000",
    0
    ]
    ]
     * }
     */
    @GetMapping("/patient")
    public CommonDTO listPatient(){
        return patientService.getList();
    }
    /**
     * @api {get} /list/doctor 获取所有医生
     * @apiGroup Doctor
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    [
    4,
    "李小豪",
    "18320444515",
    true,
    "实习医师",
    "急诊",
    "我叫李小豪，是个医生，我爱治病救人",
    2,
    0
    ],
    [
    5,
    "李大豪",
    "18320444515",
    true,
    "主任医师",
    "急诊",
    "我叫李大豪，治病救人是我的天职",
    2,
    0
    ],
    [
    10,
    "李疯",
    "18320444555",
    true,
    "退休医师",
    "妇产科",
    "我是另一个部门的FFF",
    1,
    0
    ]
    ]
     * }
     */
    @GetMapping("/doctor")
    public CommonDTO listDoctor(){
        return doctorService.getList();
    }
    /**
     * @api {get} /list/apartment 获取所有科室
     * @apiGroup Apartment
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 11,
    "apartmentName": "急诊",
    "introduction": "这里是急诊科，最多人来看病的科室，一般的感冒发烧都在这里看",
    "apartmentId": 1
    },
    {
    "id": 12,
    "apartmentName": "妇产科",
    "introduction": "这里是妇产科，每天都有很多小新生命在这里诞生",
    "apartmentId": 2
    }
    ]
     * }
     */
    @GetMapping("/apartment")
    public CommonDTO listApartment(){
//        JSONPObject jsonpObject = new JSONPObject("callback",apartmentService.getList().toString());
//        JSONPObject jsonpObject = new JSONPObject("callback","{\"message\":\"hello world!\"}");
//        return "callbackP({\"message\":\"hello world!\"})";
        return apartmentService.getList();
    }

    /**
     * @api {get} /list/history 获取所有就诊历史（病历）
     * @apiGroup History
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:{
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    [
    13,
    "王小凤",
    10,
    "急性肠胃炎",
    "肚子不舒服，头晕想呕，很难受",
    "藿香正气液、阿莫西林胶囊",
    0,
    20
    ],
    [
    14,
    "王小明",
    4,
    "运动造成的乳酸堆积",
    "运动后的第二天全身酸痛，动弹不得",
    "水杨酸甲酯软膏",
    0,
    15
    ]
    ]
     * }
     */
    @GetMapping("/history")
    public CommonDTO listHistory(){
        return historyService.getList();
    }

    @PostMapping("/test")
    public String test(String hello){
//        JSONPObject jsonpObject = new JSONPObject("callback",apartmentService.getList().toString());
//        JSONPObject jsonpObject = new JSONPObject("callback","{\"message\":\"hello world!\"}");
        return "callbackP({\"message\":"+hello+"})";
    }
}
