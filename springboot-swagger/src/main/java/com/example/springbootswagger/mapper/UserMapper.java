package com.example.springbootswagger.mapper;

import com.example.springbootswagger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/8 21:24
 */

@Repository
public interface UserMapper {

    //根据id查找数据
    User selectById(int id);

    //增加数据
    void add(User user);

    //查找全部数据
    List<User> list();

    //根据id删除数据
    void delete(int id);

    //根据id修改数据
    void update(User user);

}
