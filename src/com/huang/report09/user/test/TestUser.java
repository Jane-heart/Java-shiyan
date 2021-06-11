package com.huang.report09.user.test;

import com.huang.report09.user.dao.IUserDao;
import com.huang.report09.user.dao.UserDaoImpl;
import com.huang.report09.user.domain.User;

import java.util.*;

public class TestUser {
    public static void main(String[] args) {
        //接口多态
        IUserDao userDao = new UserDaoImpl();

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            User user = userDao.addUser();
            users.add(user);
        }
        for (User temp:users) {
            System.out.println(temp);
        }
        if (userDao.loginUser( users )){
            System.out.println( "欢迎您！管理员" );
            userDao.resetPsw( users);
        }
    }
}
