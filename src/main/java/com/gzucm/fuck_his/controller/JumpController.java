package com.gzucm.fuck_his.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tianyi
 * @date 2018-10-24 18:13
 */
@Controller
public class JumpController {

    @GetMapping("/loginP")
    public String loginP(){
        return "loginP";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/book")
    public String book(){ return "book"; }

    @GetMapping("/doctorList")
    public String doctorList(){
        return "doctorList";
    }

    @GetMapping("/doctorDetail")
    public String doctorDetail(){
        return "doctorDetail";
    }

    @GetMapping("/workstation")
    public String workstation(){
        return "workstation";
    }

    @GetMapping("/cost")
    public String cost(){
        return "cost";
    }

    @GetMapping("/doctorPC")
    public String doctorPC(){
        return "doctorPC";
    }

    @GetMapping("/testDoctor")
    public String testD(){
        return "testDoctor";
    }

    @GetMapping("/testCall")
    public String testCall(){
        return "testCall";
    }
}
