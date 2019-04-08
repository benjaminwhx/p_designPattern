/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o1;

/**
 * 抽象被观察者接口
 *
 * @author benjamin
 * @version $Id: Observerable.java, v 0.1 2019年04月08日 11:29 AM benjamin Exp $
 */
public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}