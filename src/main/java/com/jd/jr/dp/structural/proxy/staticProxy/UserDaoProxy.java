package com.jd.jr.dp.structural.proxy.staticProxy;

import com.jd.jr.dp.structural.proxy.IUserDao;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-15
 * Time: 3:32 pm
 */
public class UserDaoProxy implements IUserDao {

    //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}
