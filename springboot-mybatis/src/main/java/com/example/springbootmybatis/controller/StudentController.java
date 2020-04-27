package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Student;
import com.example.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/23 1:00
 * @Describe
 */

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/selectById")
    public Student selectById(int id){
        return studentService.selectById(id);
    }

    @GetMapping(value = "/list")
    public List<Student> list(){
        return studentService.list();
    }

    @DeleteMapping(value = "/delete")
    public String delete(int id){
        studentService.delete(id);
        return "delete OK";
    }

    @PostMapping(value = "/add")
    public String add(@RequestBody Student student){
        studentService.add(student);
        return "add OK";
    }

    @PutMapping(value = "/update")
    public String update(@RequestBody Student student){
        studentService.update(student);
        return "update OK";
    }

}
