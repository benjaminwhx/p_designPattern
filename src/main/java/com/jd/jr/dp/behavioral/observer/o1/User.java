/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o1;

/**
 *
 * @author benjamin
 * @version $Id: User.java, v 0.1 2019年04月08日 11:40 AM benjamin Exp $
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(name + " 收到推送消息：" + message);
    }
}