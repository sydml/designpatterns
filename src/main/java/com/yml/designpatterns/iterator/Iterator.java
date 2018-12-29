package com.yml.designpatterns.iterator;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public interface Iterator {
    Object first();

    Object next();

    Boolean isDone();

    Object currentItem();
}
