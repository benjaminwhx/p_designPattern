/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.decorator;

/**
 *
 * @author benjamin
 * @version $Id: ConcretComponent.java, v 0.1 2019年08月04日 5:19 PM benjamin Exp $
 */
public class ConcretComponent implements Component {

    @Override
    public void biu() {
        System.out.println("biubiubiu");
    }
}