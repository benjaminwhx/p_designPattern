package com.jd.jr.dp.creational.abstractFactory;

import com.jd.jr.dp.creational.factoryMethod.MailSender;
import com.jd.jr.dp.creational.factoryMethod.Sender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午5:01
 */
public class MailSenderFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
