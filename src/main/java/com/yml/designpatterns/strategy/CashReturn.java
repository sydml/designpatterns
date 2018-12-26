package com.yml.designpatterns.strategy;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class CashReturn implements CashSuper {

    private Double moneyCondition = 0.0d;
    private Double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public Double acceptCash(Double money) {
        Double result = money;
        if (money > moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
