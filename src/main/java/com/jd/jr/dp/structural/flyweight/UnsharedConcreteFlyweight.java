/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 * 非享元角色
 *
 * @author benjamin
 * @version $Id: UnsharedConcreteFlyweight.java, v 0.1 2019年08月04日 9:07 PM benjamin Exp $
 */
public class UnsharedConcreteFlyweight {
    @Getter
    @Setter
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}