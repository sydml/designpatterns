package com.yml.designpatterns.proxy;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class Proxy implements IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
