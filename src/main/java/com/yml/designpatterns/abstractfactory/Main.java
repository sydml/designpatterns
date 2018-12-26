package com.yml.designpatterns.abstractfactory;

import com.yml.designpatterns.basebean.Department;
import com.yml.designpatterns.basebean.User;

/**
 * 隔离底层多种数据库访问细节，抽象工厂模式
 *改进
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);
        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }
}
