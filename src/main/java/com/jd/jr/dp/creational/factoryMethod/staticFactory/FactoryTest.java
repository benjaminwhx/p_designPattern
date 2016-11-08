package com.jd.jr.dp.creational.factoryMethod.staticFactory;

import com.jd.jr.dp.creational.factoryMethod.Sender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:41
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender mailSender = SenderFactory.produceMail();
        mailSender.send();
        Sender smsSender = SenderFactory.produceSms();
        smsSender.send();
    }
}
