package com.jd.jr.dp.cretional.factoryMethodPattern.staticFactory;

import com.jd.jr.dp.cretional.factoryMethodPattern.MailSender;
import com.jd.jr.dp.cretional.factoryMethodPattern.Sender;
import com.jd.jr.dp.cretional.factoryMethodPattern.SmsSender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午3:40
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SenderFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
