package com.lxm.common.bean;

import javax.inject.Inject;

/**
 * Created by lixiaoming on 2018/6/8.
 */


public class User {
    @Inject
    public User() {
    }

    private String name;
    private String imgUrl;
    private int age;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
