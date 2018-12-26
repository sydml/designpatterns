package com.yml.designpatterns.decorator;

/**
 * 需要熟悉类的加载流程
 *
 * @author Liuym
 * @date 2018/12/16 0016
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Person person = new Person("小王");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorator(person);
        tShirts.decorator(bigTrouser);
        tShirts.show();
    }
}
