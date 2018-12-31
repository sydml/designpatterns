package com.yml.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
