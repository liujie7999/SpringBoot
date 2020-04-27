package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author liujie
 * @Date 2020/4/22 1:03
 * @Describe
 */

@Controller
public class PageController {
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
