/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author benjamin
 * @version $Id: SyncMediator.java, v 0.1 2019年08月04日 3:49 PM benjamin Exp $
 */
@Getter
@Setter
public class SyncMediator implements Mediator {
    private MysqlDatabase mysqlDatabase;
    private RedisDatabase redisDatabase;
    private EsDatabase esDatabase;

    @Override
    public void sync(String databaseName, String data) {
        if (AbstractDatabase.MYSQL.equals(databaseName)) {
            // mysql 同步到 redis 和 Elasticsearch
            this.redisDatabase.addData(data);
            this.esDatabase.addData(data);
        } else if (AbstractDatabase.REDIS.equals(databaseName)) {
            // redis 缓存同步，不需要同步到其他数据库
        } else if (AbstractDatabase.ELASTICSEARCH.equals(databaseName)) {
            // Elasticsearch 同步到 Mysql
            this.mysqlDatabase.addData(data);
        }
    }
}