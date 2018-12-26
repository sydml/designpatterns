package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Graphics {
    public void draw(Pen pen, String name) {
        System.out.println("使用" + pen.getColor() + "的画笔画" + name);
    }
}
