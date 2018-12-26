package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Graphics graphics, Pen pen) {
        super(graphics, pen);
    }

    @Override
    public void builderHead() {
        graphics.draw(pen,"thin head");
    }

    @Override
    public void builderBody() {
        graphics.draw(pen,"thin body");
    }

    @Override
    public void builderArmLeft() {
        graphics.draw(pen,"thin arm left");
    }

    @Override
    public void builderArmRight() {
        graphics.draw(pen,"thin arm right");
    }

    @Override
    public void builderLegLeft() {
        graphics.draw(pen,"thin leg left");
    }

    @Override
    public void builderLegRight() {
        graphics.draw(pen,"thin leg right");
    }
}
