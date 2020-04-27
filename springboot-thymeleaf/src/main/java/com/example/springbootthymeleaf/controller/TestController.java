package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @Author liujie
 * @Date 2020/4/22 1:51
 * @Describe
 */

@Controller
public class TestController {

    @GetMapping(value = "/show")
    public String show(Model model){
        model.addAttribute("msg","Hello Thymeleaf");
        model.addAttribute("data",new Date());
        model.addAttribute("sex","男");
        model.addAttribute("id",1);

        List<Users> list = new ArrayList<>();
        list.add(new Users("1","admin",12));
        list.add(new Users("2","admin1",42));
        list.add(new Users("3","admin2",22));
        model.addAttribute("list",list);

        Map<String,Users> map = new HashMap<>();
        map.put("user1",new Users("1","admin1",22));
        map.put("user2",new Users("2","admin2",22));
        map.put("user3",new Users("3","admin3",22));
        model.addAttribute("map",map);
        return "index";
    }
}
