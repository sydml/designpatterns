package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.User;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
