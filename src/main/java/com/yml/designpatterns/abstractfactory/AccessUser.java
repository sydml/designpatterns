package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.User;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("插入一条 access user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("获取一条 access user");
        return null;
    }
}
