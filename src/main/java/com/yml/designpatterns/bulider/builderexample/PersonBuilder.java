package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public abstract class PersonBuilder {
   protected Graphics graphics;
   protected Pen pen;

    public PersonBuilder(Graphics graphics, Pen pen) {
        this.graphics = graphics;
        this.pen = pen;
    }

    public abstract void builderHead();
    public abstract void builderBody();
    public abstract void builderArmLeft();
    public abstract void builderArmRight();
    public abstract void builderLegLeft();
    public abstract void builderLegRight();
    

}
