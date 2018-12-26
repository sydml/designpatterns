package com.yml.designpatterns.abstractfactory;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
