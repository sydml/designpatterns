package com.yml.designpatterns.decorator;

/**
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
