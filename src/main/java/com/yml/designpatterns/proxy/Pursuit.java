package com.yml.designpatterns.proxy;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("give Dolls to:"+mm.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println("give flowers to:"+mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("give chocolate to:"+mm.getName());
    }
}
