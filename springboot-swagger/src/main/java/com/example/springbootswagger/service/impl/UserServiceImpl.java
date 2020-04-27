package com.example.springbootswagger.service.impl;

import com.example.springbootswagger.entity.User;
import com.example.springbootswagger.mapper.UserMapper;
import com.example.springbootswagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liujie
 * @Date 2020/4/8 21:25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
