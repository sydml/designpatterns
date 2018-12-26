package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.Department;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}

