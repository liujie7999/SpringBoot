package com.example.springbootjdbc.entity;

public class Users {
    private Integer userid;
    private String username;
    private String usersex;

    public Users() {

    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Users(Integer userid, String username, String usersex) {
        this.userid = userid;
        this.username = username;
        this.usersex = usersex;
    }
}
