/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.mediator;

/**
 *
 * @author benjamin
 * @version $Id: MediatorTest.java, v 0.1 2019年08月04日 3:57 PM benjamin Exp $
 */
public class MediatorTest {

    public static void main(String[] args) {
        SyncMediator mediator = new SyncMediator();
        MysqlDatabase mysqlDatabase = new MysqlDatabase(mediator);
        RedisDatabase redisDatabase = new RedisDatabase(mediator);
        EsDatabase esDatabase = new EsDatabase(mediator);
        mediator.setMysqlDatabase(mysqlDatabase);
        mediator.setRedisDatabase(redisDatabase);
        mediator.setEsDatabase(esDatabase);

        System.out.println("\n---------mysql 添加数据 1，将同步到Redis和ES中-----------");
        mysqlDatabase.add("1");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------Redis添加数据 2，将不同步到其它数据库-----------");
        redisDatabase.add("2");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------ES 添加数据 3，只同步到 Mysql-----------");
        esDatabase.add("3");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();
    }
}