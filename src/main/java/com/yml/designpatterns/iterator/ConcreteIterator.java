package com.yml.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate;
    }

    @Override
    public Object next() {
        Object next = null;
        current++;
        if (current < aggregate.count()) {
            next = aggregate.getIndex(current);
        }
        return next;
    }

    @Override
    public Boolean isDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getIndex(current);
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.iterator();
        list.add("a");
        list.add(0, "b");
    }
}
