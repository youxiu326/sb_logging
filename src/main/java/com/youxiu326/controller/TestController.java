package com.youxiu326.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static Logger log = LoggerFactory.getLogger(TestController.class);


    @RequestMapping("/test")
    public @ResponseBody String testLogging(@RequestParam("a") String a){
        log.info("牛逼比");
        return "success";
    }
} 