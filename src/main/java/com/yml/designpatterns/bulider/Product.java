package com.yml.designpatterns.bulider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.forEach(it -> System.out.println(it));
    }
}
