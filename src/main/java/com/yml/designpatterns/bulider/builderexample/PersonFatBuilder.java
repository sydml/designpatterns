package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class PersonFatBuilder extends PersonBuilder {

    public PersonFatBuilder(Graphics graphics, Pen pen) {
        super(graphics, pen);
    }

    @Override
    public void builderHead() {
        graphics.draw(pen,"fat head");
    }

    @Override
    public void builderBody() {
        graphics.draw(pen,"fat body");
    }

    @Override
    public void builderArmLeft() {
        graphics.draw(pen,"fat arm left");
    }

    @Override
    public void builderArmRight() {
        graphics.draw(pen,"fat arm right");
    }

    @Override
    public void builderLegLeft() {
        graphics.draw(pen,"fat leg left");
    }

    @Override
    public void builderLegRight() {
        graphics.draw(pen,"fat leg right");
    }
}
