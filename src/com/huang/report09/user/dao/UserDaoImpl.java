package com.huang.report09.user.dao;


import com.huang.report09.user.domain.User;
import com.huang.report09.user.util.DateUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDaoImpl implements IUserDao {

    Scanner scanner;
    User user;
    public UserDaoImpl(){
        scanner = new Scanner(System.in);
    }

    @Override
    public User addUser() {
        //模拟从键盘输入一个用户信息

        User user = new User();
        System.out.print("请输入用户名：");
        user.setUserName(scanner.nextLine());
        System.out.print("请输入密码：");
        user.setPsw(scanner.nextLine());
        System.out.print("请输入出生日期（2020-06-12）：");
        user.setBirthday(DateUtils.stringToDate(scanner.nextLine(),"yyyy-MM-dd"));
        return user;
    }

    @Override
    public boolean loginUser(ArrayList<User> users) {
        user = this.addUser();

        for (User temp:users) {
            if (user.equals( temp )){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean resetPsw(ArrayList<User> users) {

        String psw = "";
        System.out.println("请输入您的旧密码");
        if (!scanner.nextLine().equals( user.getPsw() )){
            System.out.println("您的密码不正确，请重新输入");
            return false;
        }
        System.out.println("请输入您的新密码");
        psw = scanner.nextLine();
        System.out.println("请再次输入您的新密码");
        if (!scanner.nextLine().equals( psw )){
            System.out.println("两次密码不一致，请重新输入");
            return false;
        }
        return true;
    }

}
