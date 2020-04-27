package com.example.springbootmybatis.entity;

import java.io.Serializable;

/**
 * @Author liujie
 * @Date 2020/4/23 0:44
 * @Describe
 */
public class Student implements Serializable {
    private String sno;
    private String sname;
    private String ssex;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Student(String sno, String sname, String ssex) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
    }
}
