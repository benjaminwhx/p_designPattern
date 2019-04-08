/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i1;

/**
 *
 * @author benjamin
 * @version $Id: Iterator.java, v 0.1 2019年04月08日 1:54 PM benjamin Exp $
 */
public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}