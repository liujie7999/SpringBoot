package com.example.springbootjdbc.dao.impl;

import com.example.springbootjdbc.dao.UserDao;
import com.example.springbootjdbc.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users (username,usersex) values (?,?)";
        this.jdbcTemplate.update(sql,users.getUsername(),users.getUsersex());
    }

    @Override
    public List<Users> list() {
        String sql="select * from users";
        return jdbcTemplate.query(sql, new RowMapper<Users>() {
            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                Users users = new Users();
                users.setUserid(resultSet.getInt("userid"));
                users.setUsername(resultSet.getString("username"));
                users.setUsersex(resultSet.getString("usersex"));
                return users;
            }
        });
    }

    @Override
    public void selectById(int id) {
        String sql = "select * from users where id = ?";

    }

    @Override
    public void update(Users users) {
        String sql = " ";
    }

    @Override
    public void delete(int id) {
        String sql = "";
    }
}
