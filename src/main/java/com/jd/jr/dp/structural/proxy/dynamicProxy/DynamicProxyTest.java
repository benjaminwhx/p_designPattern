package com.jd.jr.dp.structural.proxy.dynamicProxy;

import com.jd.jr.dp.structural.proxy.IUserDao;
import com.jd.jr.dp.structural.proxy.UserDaoImpl;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-15
 * Time: 3:36 pm
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        // 会在项目下生成com/sun/proxy/$Proxy0.class文件
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 目标对象
        IUserDao target = new UserDaoImpl();
        // 【原始的类型 class com.jd.jr.dp.structural.proxy.UserDaoImpl】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class com.sun.proxy.$Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }
}
