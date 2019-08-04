/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.flyweight;

/**
 * 具体享元角色
 *
 * @author benjamin
 * @version $Id: ConcreteFlyweight.java, v 0.1 2019年08月04日 9:08 PM benjamin Exp $
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元:" + key + "被创建!");
    }

    @Override
    public void operate(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.print("具体享元:" + key + "被调用!");
        System.out.println("非享元信息是:" + unsharedConcreteFlyweight.getInfo());
    }
}