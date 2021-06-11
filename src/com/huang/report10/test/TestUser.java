package com.huang.report10.test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.huang.report10.dao.IUserDao;
import com.huang.report10.dao.UserDaoImpl;
import com.huang.report10.domain.User;

public class TestUser {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        //创建一个空的集合对象
        ArrayList<User> userList = new ArrayList<>();

        //用循环来控制输入学生
        do {
            IUserDao userDao = new UserDaoImpl();
            User user = userDao.addUser();
            userList.add(user);
            System.out.print("是否继续输入学生信息？（Y/N）");
        } while (!"N".equalsIgnoreCase(sc.nextLine()));
        //遍历集合元素
        //for循环
        System.out.println("for循环");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        //增强for循环
        System.out.println("增强for循环");
        for (User temp: userList) {
            System.out.println(temp);
        }
        //用迭代器iterator遍历集合元素
        System.out.println("迭代器iterator遍历集合元素");
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
