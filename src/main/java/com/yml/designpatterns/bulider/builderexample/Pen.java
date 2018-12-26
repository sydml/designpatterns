package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Pen {
    private String color;

    public String getColor() {
        return color;
    }

    public Pen(String color) {
        this.color = color;
        System.out.println("使用" + color + "色画笔");
    }
}
