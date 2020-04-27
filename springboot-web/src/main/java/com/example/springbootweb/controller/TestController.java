package com.example.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author liujie
 * @Date 2020/4/22 0:32
 * @Describe
 */

@Controller
public class TestController {

    @RequestMapping(value = "/page")
    public String page(){
        return "index.html";
    }
}
