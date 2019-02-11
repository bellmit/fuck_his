package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.service.impl.RedisQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-25 05:19
 */
@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    private RedisQueueService redisQueueService;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     * @apiDefine Websocket 通信
     */
    /**
     * @api {get} /queue/add 挂号落实
     * @apiGroup Websocket
     * @apiParam {int} patientId 病人id
     * @apiParam {int} doctorId 医生id
     * @apiSuccessExample Success-Request:
     * {
     *     /his/queue/add?patientId=3&doctorId=8
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode":200,"resultMsg":"成功","data":null
     * }
     */
    @GetMapping("/add")
    public CommonDTO addPatient(int patientId, int doctorId){
        return redisQueueService.patientBooking(patientId, doctorId);
    }

    /**
     * @api {get} /queue/call 叫下一个病人到医生处就诊
     * @apiGroup Websocket
     * @apiParam {int} doctorId 医生id
     * @apiSuccessExample Success-Request:
     * {
     *     /his/queue/call?doctorId=8
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode":200,"resultMsg":"成功","data":{"id":3,"name":"王小明","phonenumber":"18320444515","password":"1234","birthday":1234567890,"height":188.0,"weight":68.0,"address":null,"healthCardId":"7382649975","peopleCard":"441781199700000000","allergy":null,"cureTimes":0,"man":true}
     * }
     */
    @GetMapping("/call")
    public CommonDTO callNext(int doctorId){
        return redisQueueService.callNext(doctorId);
    }

    /**
     * @api {get} /queue/get 获取对应医生的排队列表
     * @apiGroup Websocket
     * @apiParam {int} doctorId 医生id
     * @apiSuccessExample Success-Request:
     * {
     *     /his/queue/get?doctorId=8
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode":200,"resultMsg":"成功","data":["1","2","3"]
     * }
     */
    @GetMapping("/get")
    public CommonDTO getQueue(int doctorId){
        return redisQueueService.getQueue(doctorId);
    }
}
