package com.huang.report07.dao;
/*
 * 用户操作类：增、删、改、查
 * 202006120115+黄健文
 */
public class UserDao {
    String userName;
    String pwd;

    public UserDao() {
        this.userName = "xiaoming";
        this.pwd = "123456";
    }

    public boolean userLogin(String userName, String pwd){
        if (userName.equals(this.userName) && pwd.equals(this.pwd)){
            return true;
        }
        return false;
    }
}
