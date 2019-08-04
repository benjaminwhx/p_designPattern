package com.jd.jr.dp.structural.proxy;

/**
 * User: benjamin.wuhaixu Date: 2018-04-15 Time: 3:32 pm
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
