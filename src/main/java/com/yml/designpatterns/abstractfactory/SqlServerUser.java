package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.User;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("插入sqlServer user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("获取 sqlServer user");
        return null;
    }
}
