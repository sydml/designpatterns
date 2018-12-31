package com.yml.designpatterns.flyweight;

import java.util.Hashtable;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("x", new ConcreteFlyweight());
        flyweights.put("y", new ConcreteFlyweight());
        flyweights.put("z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return (Flyweight) flyweights.get(key);
    }
}
