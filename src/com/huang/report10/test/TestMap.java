package com.huang.report10.test;


import com.huang.report10.dao.IUserDao;
import com.huang.report10.dao.UserDaoImpl;
import com.huang.report10.domain.User;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) throws ParseException {
        //定义一个map集合
        HashMap<String, User> userMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        //添加元素
        do {
            IUserDao userDao = new UserDaoImpl();
            User user = userDao.addUser();
            userMap.put("00"+(userMap.size()+1),user);
            System.out.println(userMap.size());
            System.out.print("是否继续输入学生信息？（Y/N）");
        } while (!"N".equalsIgnoreCase(sc.nextLine()));
        Set<String> key = userMap.keySet();
        for (String temp: key) {
            System.out.println(userMap.get(temp));
        }
        //键值对对象
        Set<Map.Entry<String, User>> entries = userMap.entrySet();
        for (Map.Entry<String,User> temp:entries){
            System.out.println(temp.getKey() + " : " + temp.getValue());
        }
    }
}
