package com.yml.designpatterns.strategy;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class CashNormal implements CashSuper{
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
