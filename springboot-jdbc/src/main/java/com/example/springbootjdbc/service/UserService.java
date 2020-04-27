package com.example.springbootjdbc.service;

import com.example.springbootjdbc.entity.Users;

import java.util.List;


public interface UserService {

    void insertUsers(Users users);

    List<Users> list();

    void selectById(int id);

    void update(Users users);

    void delete(int id);
}
