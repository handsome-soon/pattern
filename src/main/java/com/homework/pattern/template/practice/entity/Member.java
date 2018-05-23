package com.homework.pattern.template.practice.entity;

/**
 * Created by 15995 on 2018/5/22.
 */
public class Member {

    private String name;

    private String password;

    private int age;

    private String addr;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
