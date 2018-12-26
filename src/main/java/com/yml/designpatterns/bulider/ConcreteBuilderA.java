package com.yml.designpatterns.bulider;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("Part A");
    }

    @Override
    public void builderPartB() {
        product.add("Part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
