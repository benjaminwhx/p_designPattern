/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.bridge;

/**
 *
 * @author benjamin
 * @version $Id: Phone.java, v 0.1 2019年08月04日 6:21 PM benjamin Exp $
 */
public abstract class Phone {
    protected Software software;

    /**
     * Setter method for property <tt>software</tt>.
     *
     * @param software value to be assigned to property software
     */
    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();
}