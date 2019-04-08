/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o1;

/**
 * 抽象观察者
 *
 * @author benjamin
 * @version $Id: Observer.java, v 0.1 2019年04月08日 11:29 AM benjamin Exp $
 */
public interface Observer {

    void update(String message);
}