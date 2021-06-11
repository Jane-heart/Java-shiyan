package com.huang.report10.dao;

import com.huang.report10.domain.User;

import java.text.ParseException;

/**
 * 用户的操作接口:
 *  包含添加用户（注册功能）、
 *  查找用户（登录功能）、
 *  用户（重置密码）三 种抽象方法
 */
public interface IUserDao {
   //添加新用户(注册功能)
   User addUser() throws ParseException;

    //查找用户（登录功能）
   boolean loginUser(String username, String psw);

    //查找用户（登录功能）
   boolean loginUser(User user);

    // 修改用户（重置密码）
   int updateUser(User user);

}
