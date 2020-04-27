package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/23 0:48
 * @Describe
 */

@Mapper
@Repository
public interface StudentMapper {

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
