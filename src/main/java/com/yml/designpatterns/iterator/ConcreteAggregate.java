package com.yml.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> items = new ArrayList<>(10);

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public int count() {
        return items.size();
    }

    public Object getIndex(int index) {
        return items.get(index);
    }

    public void setIndex(Object value) {
        items.add(value);
    }
}
