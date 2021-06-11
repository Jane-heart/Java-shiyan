package com.huang.report10.domain;

import com.huang.report10.util.DateUtils;

import java.util.Date;

/**
 * 用户类：（用户名、密码、生日）
 */
public class User {
    private String userName;
    private String password;
    private Date birthday;
    //无参构造方法
    public User() { }
    //全参构造方法
    public User(String userName, String password, Date birthday) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
    }
    //对属性的封装
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "  用户名='" + userName + '\'' +
                ", 密码='" + password + '\'' +
                ", 出生日期=" + DateUtils.dateToString(birthday, "yyyy-MM-dd")+
                '}';
    }

}
