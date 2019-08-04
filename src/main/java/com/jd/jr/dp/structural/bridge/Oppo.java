/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.bridge;

/**
 *
 * @author benjamin
 * @version $Id: Oppo.java, v 0.1 2019年08月04日 6:22 PM benjamin Exp $
 */
public class Oppo extends Phone {

    @Override
    public void run() {
        System.out.println("oppo run");
        software.run();
    }
}