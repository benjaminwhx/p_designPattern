/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.flyweight;

/**
 * 抽象享元角色
 *
 * @author benjamin
 * @version $Id: Flyweight.java, v 0.1 2019年08月04日 9:07 PM benjamin Exp $
 */
public interface Flyweight {

    void operate(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}