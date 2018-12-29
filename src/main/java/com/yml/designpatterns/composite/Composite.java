package com.yml.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
