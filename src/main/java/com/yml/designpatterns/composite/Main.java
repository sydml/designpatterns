package com.yml.designpatterns.composite;

/**
 * 组合模式，更像一个树形结构组合，公司和部门的关系，部门就是根据公司形成了一个树结构
 *
 * @author Liuym
 * @date 2018/12/29 0029
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("leaf XA"));
        comp.add(new Leaf("leaf XB"));
        root.add(comp);
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("leaf XYA"));
        comp2.add(new Leaf("leaf XYB"));
        comp.add(comp2);
        Composite comp3 = new Composite("Composite XYZ");
        comp3.add(new Leaf("leaf XYZA"));
        comp3.add(new Leaf("leaf XYZB"));
        comp2.add(comp3);
        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
