package com.jd.jr.dp.creational.singleton;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-2:56
 */
public class Singleton5 {
    private static Singleton5 instance = new Singleton5();  // 饿汉

    private Singleton5() {}

    public static Singleton5 getInstance() {
        return instance;
    }
}
