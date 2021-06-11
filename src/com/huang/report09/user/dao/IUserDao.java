package com.huang.report09.user.dao;


import com.huang.report09.user.domain.User;

import java.util.ArrayList;

/**
 * 202006120115 黄健文
 * 用户操作类
 * 包含添加用户（注册功能）、
 * 查找用户（登录功能）、
 * 用户（重置密码）三 种抽象方法
 */
public interface IUserDao {

    /**
     * 添加用户（注册功能）:模拟从键盘输入一个用户信息
     * @return 当前输入的用户对象
     */
    User addUser();

    /**
     * 查找用户（登录功能）
     * @param users 登陆用户对象列表
     * @return 成功与否
     */
    boolean loginUser(ArrayList<User> users);

    /**
     * 用户（重置密码）
     * @param users 登陆用户对象列表
     * @return
     */
    boolean resetPsw(ArrayList<User> users);
}
