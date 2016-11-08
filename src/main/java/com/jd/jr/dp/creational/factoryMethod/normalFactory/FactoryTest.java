package com.jd.jr.dp.creational.factoryMethod.normalFactory;

import com.jd.jr.dp.creational.factoryMethod.Sender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:29
 */
public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender mailSender = senderFactory.produce("mail");
        mailSender.send();
        Sender smsSender = senderFactory.produce("sms");
        smsSender.send();
    }
}
