package com.jd.jr.dp.creational.factoryMethod.normalFactory;

import com.jd.jr.dp.creational.factoryMethod.MailSender;
import com.jd.jr.dp.creational.factoryMethod.Sender;
import com.jd.jr.dp.creational.factoryMethod.SmsSender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:27
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class SenderFactory {

    public Sender produce(String senderType) {
        if ("mail".equals(senderType)) {
            return new MailSender();
        } else if ("sms".equals(senderType)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的sender type");
            return null;
        }
    }
}
