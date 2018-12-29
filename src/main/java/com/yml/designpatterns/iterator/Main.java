package com.yml.designpatterns.iterator;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        Object a = "tom";
        Object b = "rose";
        Object c = "jack";
        aggregate.setIndex(a);
        aggregate.setIndex(b);
        aggregate.setIndex(c);
        Iterator i = new ConcreteIterator(aggregate);
        while (!i.isDone()) {
            System.out.println(i.currentItem()+"请买票");
            i.next();
        }
    }
}
