package com.yml.designpatterns.strategy;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class StrategyTest {
    public static void main(String[] args) {
        CashStrategy cashStrategy = new CashStrategy("满300返100");
        Double result = cashStrategy.getResult(600d);
        System.out.println(result);
    }

}
