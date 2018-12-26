package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.Department;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class AccessDeparment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("插入一条Access 的department");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("获取一条Access 的department");
        return null;
    }
}
