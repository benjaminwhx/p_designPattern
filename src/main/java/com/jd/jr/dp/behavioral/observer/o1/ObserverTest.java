/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o1;

/**
 * 使用自定义的类来测试观察者模式
 *
 * @author benjamin
 * @version $Id: ObserverTest.java, v 0.1 2019年04月08日 11:44 AM benjamin Exp $
 */
public class ObserverTest {

    public static void main(String[] args) {
        Observer user1 = new User("张三");
        Observer user2 = new User("李四");
        Observer user3 = new User("王五");
        WechatServer wechatServer = new WechatServer();
        wechatServer.registerObserver(user1);
        wechatServer.registerObserver(user2);
        wechatServer.registerObserver(user3);
        wechatServer.setInformation("PHP是世界上最好用的语言!");

        System.out.println("-------------");

        wechatServer.removeObserver(user1);
        wechatServer.setInformation("JAVA是世界上最好用的语言!");
    }
}