package com.yml.designpatterns.samplefactory;

/**
 * @author Liuym
 * @date 2018/12/13 0013
 */
public class OperationDiv extends Operation {
    @Override
    public Double getResult(Double numberFisrt, Double numberSecond) {
        if (numberSecond == 0) {
            throw new RuntimeException("Divisor can not be zero");
        }
        return numberFisrt / numberSecond;
    }
}
