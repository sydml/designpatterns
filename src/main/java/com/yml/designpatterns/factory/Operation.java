package com.yml.designpatterns.factory;

/**
 * @author Liuym
 * @date 2018/12/13 0013
 */
public abstract class Operation {
    private Double numberFisrt;

    private Double numberSecond;

    public Double getNumberFisrt() {
        return numberFisrt;
    }

    public void setNumberFisrt(Double numberFisrt) {
        this.numberFisrt = numberFisrt;
    }

    public Double getNumberSecond() {
        return numberSecond;
    }

    public void setNumberSecond(Double numberSecond) {
        this.numberSecond = numberSecond;
    }

    public abstract Double getResult(Double numberFisrt, Double numberSecond);

}
