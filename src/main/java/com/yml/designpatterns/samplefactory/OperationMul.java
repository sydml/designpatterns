package com.yml.designpatterns.samplefactory;

/**
 * @author Liuym
 * @date 2018/12/13 0013
 */
public class OperationMul extends Operation {
    @Override
    public Double getResult(Double numberFisrt, Double numberSecond) {
        return numberFisrt * numberSecond;
    }
}
