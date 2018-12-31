package com.yml.designpatterns.flyweight;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {

    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx = f.getFlyweight("x");
        fx.operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("y");
        fy.operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("z");
        fz.operation(--extrinsicState);
    }

}
