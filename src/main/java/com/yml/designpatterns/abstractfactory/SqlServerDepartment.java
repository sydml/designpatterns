package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.Department;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("insert sqlServer department");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("获取sqlServer的department");
        return null;
    }
}
