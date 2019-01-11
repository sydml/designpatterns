package com.yml.designpatterns.bulider.streambuilder.innerclassbuilder;

/**
 * @author Liuym
 * @date 2019/1/11 0011
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("Rose").age(18).address("N-Y").phone("132435435324").gender('f').builder();
    }
}
