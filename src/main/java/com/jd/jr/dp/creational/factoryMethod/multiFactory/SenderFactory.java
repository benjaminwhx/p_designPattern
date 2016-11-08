package com.jd.jr.dp.creational.factoryMethod.multiFactory;

import com.jd.jr.dp.creational.factoryMethod.MailSender;
import com.jd.jr.dp.creational.factoryMethod.Sender;
import com.jd.jr.dp.creational.factoryMethod.SmsSender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:37
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
 * 则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SenderFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
