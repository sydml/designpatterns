package com.yml.designpatterns.memento;

/**
 * 备忘录模式，将原对象的状态设置到管理类里，需要恢复时，从管理类恢复即可
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("off");
        originator.show();
        //恢复初始状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
