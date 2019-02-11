package com.gzucm.fuck_his.websocket.controller;

import com.gzucm.fuck_his.websocket.model.RequestMessage;
import com.gzucm.fuck_his.websocket.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: vesus
 * @CreateDate: 2018/5/29 下午1:48
 * @Version: 1.0
 */
@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate ;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }


    @MessageMapping("/callNext")
    public ResponseMessage toUser(RequestMessage msg ) {
        System.out.println("----------------" + msg.getMessage());
        this.messagingTemplate.convertAndSendToUser("123","/message", msg.getMessage());
        return new ResponseMessage("欢迎使用webScoket："+msg.getMessage());
    }

}
