package com.jd.jr.dp.creational.abstractFactory;

import com.jd.jr.dp.creational.factoryMethod.Sender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午5:02
 */
public class SenderTest {

    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
