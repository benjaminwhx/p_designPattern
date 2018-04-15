package com.jd.jr.dp.structural.proxy.staticProxy;

import com.jd.jr.dp.structural.proxy.IUserDao;
import com.jd.jr.dp.structural.proxy.UserDaoImpl;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-15
 * Time: 3:33 pm
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //目标对象
        IUserDao target = new UserDaoImpl();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}
