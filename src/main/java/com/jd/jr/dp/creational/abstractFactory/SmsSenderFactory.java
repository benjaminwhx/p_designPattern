package com.jd.jr.dp.creational.abstractFactory;

import com.jd.jr.dp.creational.factoryMethod.Sender;
import com.jd.jr.dp.creational.factoryMethod.SmsSender;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午4:46
 */
public class SmsSenderFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
