package com.jd.jr.dp.creational.factoryMethod;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:27
 */
public class SmsSender implements Sender {

    public void send() {
        System.out.println("this is sms sender");
    }
}
