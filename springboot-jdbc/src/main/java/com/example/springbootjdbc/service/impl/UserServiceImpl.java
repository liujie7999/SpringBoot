package com.example.springbootjdbc.service.impl;

import com.example.springbootjdbc.dao.UserDao;
import com.example.springbootjdbc.entity.Users;
import com.example.springbootjdbc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public void insertUsers(Users users) {
        this.userDao.insertUsers(users);
    }

    @Override
    public List<Users> list() {
        return this.userDao.list();
    }

    @Override
    public void selectById(int id) {

    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void delete(int id) {

    }
}
