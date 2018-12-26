package com.yml.designpatterns.strategy;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class CashStrategy {

    private CashSuper cs = null;

    public CashStrategy(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
            default:
                cs = new CashNormal();
        }
    }

    public Double getResult(Double money) {
        return cs.acceptCash(money);
    }

}
