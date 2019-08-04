/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.mediator;

/**
 * 中介者
 *
 * @author benjamin
 * @version $Id: Mediator.java, v 0.1 2019年08月04日 3:48 PM benjamin Exp $
 */
public interface Mediator {

    /**
     * 同步数据
     *
     * @param databaseName
     * @param data
     */
    void sync(String databaseName, String data);
}