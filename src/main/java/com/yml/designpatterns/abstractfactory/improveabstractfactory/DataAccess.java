package com.yml.designpatterns.abstractfactory.improveabstractfactory;

import com.yml.designpatterns.abstractfactory.*;

/**
 * 实际使用配置中参数获取数据库连接
 * 同样使用反射获取数据库连接是目前项目的使用方式
 *
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class DataAccess {
    private static final String db = "SqlServer";
//    private static final String db = "Access";

    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "SqlServer":
                result = new SqlServerUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
            default:
                result = null;
        }
        return result;
    }
    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "SqlServer":
                result = new SqlServerDepartment();
                break;
            case "Access":
                result = new AccessDeparment();
                break;
            default:
                result = null;
        }
        return result;
    }
}
