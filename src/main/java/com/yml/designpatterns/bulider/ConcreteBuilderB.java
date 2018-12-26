package com.yml.designpatterns.bulider;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class ConcreteBuilderB implements Builder {
    private Product product = new Product();
    @Override
    public void builderPartA() {
        product.add("Part X");
    }

    @Override
    public void builderPartB() {
        product.add("Part Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
