package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Student;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/23 0:57
 * @Describe
 */
public interface StudentService {


    //根据id查找数据
    Student selectById(int id);

    //增加数据
    void add(Student student);

    //查找全部数据
    List<Student> list();

    //根据id删除数据
    void delete(int id);

    //根据id修改数据
    void update(Student student);

}
