package com.huang.report07.test;


import com.huang.report07.dao.UserDao;

import java.util.Scanner;

/*
* 用户测试类：
* 202006120115+黄健文
*/
public class TestUser {
    public static void main(String[] args) {
        int i = 0;
        UserDao userDao = new UserDao();
        String useName = new String();
        String pwd = new String();
        Scanner scanner = new Scanner(System.in);
        for (i = 3; i > 0; i--) {
            System.out.print("please user name:");
            useName = scanner.next();
            System.out.print("please user password:");
            pwd = scanner.next();
            if (userDao.userLogin(useName,pwd)){
                System.out.println("登陆成功");
                break;
            }
            else{
                if (i == 1){
                    System.out.println("你的账户被锁定，请与管理员联系");
                    break;
                }
                System.out.println("登陆失败，你还有" + (i-1) + "次机会");
            }
        }
    }
}
