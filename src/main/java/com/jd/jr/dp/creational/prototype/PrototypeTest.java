package com.jd.jr.dp.creational.prototype;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:04
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new ConcretePrototype1();
        ConcretePrototype1 concretePrototype1 = (ConcretePrototype1) p1.clone();
        System.out.println(concretePrototype1.flag);
        Prototype p2 = new ConcretePrototype2();
        ConcretePrototype2 concretePrototype2 = (ConcretePrototype2) p2.clone();
        System.out.println(concretePrototype2.flag);
    }
}
