package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartController {
    @RequestMapping("/quick")
    public String quick(){
        return "springboot 访问成功!12344";
    }

}