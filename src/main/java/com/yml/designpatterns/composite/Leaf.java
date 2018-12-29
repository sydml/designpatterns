package com.yml.designpatterns.composite;

/**
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("can't add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("can't remove from a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder s = new StringBuilder();
        for (int i=0;i<depth; i++) {
            s.append("-");
        }
        System.out.println(s + name);
    }
}
