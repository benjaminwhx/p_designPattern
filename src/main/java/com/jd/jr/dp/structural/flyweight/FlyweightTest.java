/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.flyweight;

/**
 *
 * @author benjamin
 * @version $Id: FlyweightTest.java, v 0.1 2019年08月04日 9:13 PM benjamin Exp $
 */
public class FlyweightTest {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight("a");
        Flyweight f2 = factory.getFlyweight("a");
        Flyweight f3 = factory.getFlyweight("a");
        Flyweight f4 = factory.getFlyweight("b");
        Flyweight f5 = factory.getFlyweight("b");
        f1.operate(new UnsharedConcreteFlyweight("第一次调用a"));
        f2.operate(new UnsharedConcreteFlyweight("第二次调用a"));
        f3.operate(new UnsharedConcreteFlyweight("第三次调用a"));
        f4.operate(new UnsharedConcreteFlyweight("第一次调用b"));
        f5.operate(new UnsharedConcreteFlyweight("第二次调用b"));
    }
}