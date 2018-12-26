package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("yellow");
        Graphics graphics = new Graphics();
        PersonBuilder personBuilder = new PersonThinBuilder(graphics, pen);
        PersonDirector personDirector = new PersonDirector(personBuilder);
        personDirector.createPerson();
    }
}
