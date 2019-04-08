/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author benjamin
 * @version $Id: Student.java, v 0.1 2019年04月08日 11:52 AM benjamin Exp $
 */
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " 接收到的任务:" + arg);
    }
}