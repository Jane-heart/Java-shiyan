package com.huang.report09.user.domain;

import com.huang.report09.user.util.DateUtils;

import java.util.Date;

/**
 * 202006120115 黄健文
 * 用户类：用户名 密码 生日
 */
public class User {
    private String userName;
    private String psw;
    private Date birthday;

    //无参构造
    public User(){}
    public User(String userName, String psw, Date birthday) {
        this.userName = userName;
        this.psw = psw;
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPsw() {
        return psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
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
                "用户名='" + userName + '\'' +
                ", 密码='" + psw + '\'' +
                ", 出生日期=" + DateUtils.dateToString(birthday,"yyyy年MM月dd日") +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof User){
            User user = (User) obj;
            if (this.userName.equals( user.getUserName() ) && this.psw.equals( user.getPsw() ) && DateUtils.dateToString( this.birthday, "yyyy年MM月dd日").equals( DateUtils.dateToString( user.getBirthday(),"yyyy年MM月dd日" ) )){
                return true;
            }
        }
        return false;
    }
}
