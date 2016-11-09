package com.jd.jr.dp.creational.prototype;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:02
 */
public class ConcretePrototype1 extends Prototype {

    public static final int flag = 1;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
