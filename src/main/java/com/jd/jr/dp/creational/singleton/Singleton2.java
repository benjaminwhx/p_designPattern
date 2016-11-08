package com.jd.jr.dp.creational.singleton;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午5:32
 */
public class Singleton2 {

    private Singleton2() {}

    private static class SingletonFactory {
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonFactory.instance;
    }
}
