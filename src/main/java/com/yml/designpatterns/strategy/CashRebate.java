package com.yml.designpatterns.strategy;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class CashRebate implements CashSuper{
    private Double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public Double acceptCash(Double money) {
        return money*moneyRebate;
    }
}
