package com.example.springbootjdbc.controller;

import com.example.springbootjdbc.entity.Users;
import com.example.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public String showInfo(Users users){

        try {
            userService.insertUsers(users);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @PostMapping("/findall")
    public String findall(Model model){
        List<Users> list = null;
        try {
           list = this.userService.list();
           model.addAttribute("list",list);
            return "showUsers";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }
}
