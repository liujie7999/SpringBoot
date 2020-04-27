package com.example.springbootfreemarker.controller;

import com.example.springbootfreemarker.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/22 1:18
 * @Describe
 */
@Controller
public class UsersController {
    @GetMapping("/showUsers")
    public String showUsers(Model model){
        System.out.println("<<<<<<<<");
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin","F","32"));
        list.add(new Users("zhangsan","G","32"));
        list.add(new Users("lisi","G","36"));
        model.addAttribute("list",list);
        return "usersList";
    }

}
