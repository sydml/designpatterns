package com.yml.designpatterns.decorator;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}
