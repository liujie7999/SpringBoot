package com.example.springbootjdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/{page}}")
    public String ShowPage(@PathVariable String page){
        return page;
    }
    // @RequestMapping("/adduser")
    // public String ShowPage(){
    //     return "adduser";
    // }

}
