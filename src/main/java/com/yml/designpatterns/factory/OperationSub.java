package com.yml.designpatterns.factory;

/**
 * @author Liuym
 * @date 2018/12/13 0013
 */
public class OperationSub extends Operation {
    @Override
    public Double getResult(Double numberFisrt, Double numberSecond) {
        return numberFisrt-numberSecond;
    }
}
