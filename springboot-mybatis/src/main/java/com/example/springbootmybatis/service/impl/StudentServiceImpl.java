package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.entity.Student;
import com.example.springbootmybatis.mapper.StudentMapper;
import com.example.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/23 0:58
 * @Describe
 */

@Service()
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(int id) {
        return studentMapper.selectById(id);
    }

    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public void delete(int id) {
        studentMapper.delete(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }
}
