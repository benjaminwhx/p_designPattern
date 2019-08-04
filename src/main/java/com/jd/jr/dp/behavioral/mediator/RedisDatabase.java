/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.mediator;

/**
 *
 * @author benjamin
 * @version $Id: RedisDatabase.java, v 0.1 2019年08月04日 3:50 PM benjamin Exp $
 */
public class RedisDatabase extends AbstractDatabase {

    public RedisDatabase(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("Redis 添加数据：" + data);
        this.dataset.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        this.mediator.sync(REDIS, data); // 数据同步作业交给中介者管理
    }

    public void cache() {
        System.out.println("Redis 缓存的数据：" + this.dataset.toString());
    }
}