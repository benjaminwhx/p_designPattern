package com.jd.jr.dp.creational.prototype;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:03
 */
public class ConcretePrototype2 extends Prototype {

    public static final int flag = 2;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }
}
