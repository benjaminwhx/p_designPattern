package com.jd.jr.dp.cretional.factoryMethodPattern.multiFactory;

import com.jd.jr.dp.cretional.factoryMethodPattern.Sender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:38
 */
public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender mailSender = senderFactory.produceMail();
        mailSender.send();
        Sender smsSender = senderFactory.produceSms();
        smsSender.send();
    }
}
