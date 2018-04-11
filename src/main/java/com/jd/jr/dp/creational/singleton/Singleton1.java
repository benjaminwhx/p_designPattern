package com.jd.jr.dp.creational.singleton;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午5:12
 */
public class Singleton1 {
    // 一定要加上volatile，防止重排序。
    private static volatile Singleton1 instance = null;  // 懒汉

    private Singleton1(){}

    public static Singleton1 getInstance() {
        // 双重锁机制解决多线程问题
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
