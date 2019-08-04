/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.decorator;

/**
 *
 * @author benjamin
 * @version $Id: Decorator.java, v 0.1 2019年08月04日 5:20 PM benjamin Exp $
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void biu() {
        System.out.println("ready go!");
        this.component.biu();
    }
}