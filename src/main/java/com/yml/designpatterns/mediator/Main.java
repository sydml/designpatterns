package com.yml.designpatterns.mediator;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(c1);
        mediator.setColleague2(c2);
        c1.send("吃过饭了吗？");
        c2.send("没有呢，你请客吗？");
    }
}
