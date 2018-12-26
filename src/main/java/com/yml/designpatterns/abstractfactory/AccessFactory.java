package com.yml.designpatterns.abstractfactory;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDeparment();
    }
}
