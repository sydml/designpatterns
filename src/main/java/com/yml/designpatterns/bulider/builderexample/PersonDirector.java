package com.yml.designpatterns.bulider.builderexample;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    public void createPerson(){
        personBuilder.builderHead();
        personBuilder.builderBody();
        personBuilder.builderArmLeft();
        personBuilder.builderArmRight();
        personBuilder.builderLegLeft();
        personBuilder.builderArmRight();
    }
}
