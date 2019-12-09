package com.st.compassite;

import java.util.ArrayList;

public class CompasiteTest {
    public static void main(String[] args) {
        Composite c0=new Composite();
        Composite c1=new Composite();
        Leaf leaf1=new Leaf("树叶1");
        Leaf leaf2=new Leaf("树叶2");
        Leaf leaf3=new Leaf("树叶3");
        c0.add(c1);
        c0.add(leaf1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}

//抽象组件
interface Compenent{
    public void add(Compenent c);
    public void remove(Compenent c);
    public Compenent getChild(int i);
    public void operation();
}

//树叶节点
class Leaf implements Compenent{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Compenent c) {

    }

    @Override
    public void remove(Compenent c) {

    }

    @Override
    public Compenent getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶节点"+name+"被访问了！");
    }
}

//树枝节点
class Composite implements Compenent{
    private ArrayList<Compenent> children=new ArrayList<Compenent>();
    @Override
    public void add(Compenent c) {
        children.add(c);
    }

    @Override
    public void remove(Compenent c) {
        children.remove(c);
    }

    @Override
    public Compenent getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Compenent child:children) {
            child.operation();
        }
    }
}