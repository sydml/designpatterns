package com.yml.designpatterns.abstractfactory.improveabstractfactory;

import com.yml.designpatterns.abstractfactory.IDepartment;
import com.yml.designpatterns.abstractfactory.IUser;
import com.yml.designpatterns.basebean.Department;
import com.yml.designpatterns.basebean.User;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        IUser iUser = DataAccess.createUser();
        IDepartment iDepartment = DataAccess.createDepartment();
        iUser.insert(user);
        iUser.getUser(1);
        iDepartment.insert(department);
        iDepartment.getDepartment(1);

    }
}
