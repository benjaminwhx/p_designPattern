/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.decorator;

/**
 *
 * @author benjamin
 * @version $Id: DecoratorTest.java, v 0.1 2019年08月04日 5:21 PM benjamin Exp $
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component component = new Decorator(new ConcretComponent());
        component.biu();
    }
}