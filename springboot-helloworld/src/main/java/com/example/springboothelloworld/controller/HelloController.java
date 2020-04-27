package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liujie
 * @Date 2020/4/21 23:32
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello spring";
    }
}
