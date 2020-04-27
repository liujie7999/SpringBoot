package com.example.springbootswagger.controller;

import com.example.springbootswagger.entity.User;
import com.example.springbootswagger.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/8 21:24
 */

@Api(value = "用户Controller")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
     private UserServiceImpl userService;

    @ApiOperation(value = "获取用户信息", notes = "根据用户id获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    public User selectById(int id){
        return userService.selectById(id);
    }

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @RequestMapping(value = "/listall",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }

    @ApiOperation(value = "删除用户", notes = "根据用户id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id){
        userService.delete(id);
        return "delete OK";
    }

    @ApiOperation(value = "新增用户", notes = "根据用户实体创建用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody User user){
        userService.add(user);
        return "add OK";
    }

    @ApiOperation(value = "更新用户", notes = "根据用户id更新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User") })
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@RequestBody User user){
        userService.update(user);
        return "update OK";
    }

}