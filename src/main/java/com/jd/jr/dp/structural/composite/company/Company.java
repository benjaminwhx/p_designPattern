package com.jd.jr.dp.structural.composite.company;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-11
 * Time: 8:38 pm
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
}
