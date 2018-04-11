package com.jd.jr.dp.structural.composite;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-11
 * Time: 8:25 pm
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
