package com.jd.jr.dp.creational.singleton;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午5:33
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {}

    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }
}
