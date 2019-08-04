/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.bridge;

/**
 *
 * @author benjamin
 * @version $Id: Appstore.java, v 0.1 2019年08月04日 6:21 PM benjamin Exp $
 */
public class Appstore implements Software {

    @Override
    public void run() {
        System.out.println("run app store");
    }
}