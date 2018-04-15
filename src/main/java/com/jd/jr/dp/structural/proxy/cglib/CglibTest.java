package com.jd.jr.dp.structural.proxy.cglib;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-15
 * Time: 4:23 pm
 */
public class CglibTest {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
