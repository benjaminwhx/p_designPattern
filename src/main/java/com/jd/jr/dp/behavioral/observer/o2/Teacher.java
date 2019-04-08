/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o2;

import java.util.Observable;

/**
 *
 * @author benjamin
 * @version $Id: Teacher.java, v 0.1 2019年04月08日 11:52 AM benjamin Exp $
 */
public class Teacher extends Observable {

    public void setHomework(String info) {
        System.out.println("布置的作业是:" + info);
        setChanged();
        notifyObservers(info);
    }
}