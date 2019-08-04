/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象数据库类
 *
 * @author benjamin
 * @version $Id: AbstractDatabase.java, v 0.1 2019年08月04日 3:50 PM benjamin Exp $
 */
public abstract class AbstractDatabase {

    protected List<String> dataset = new ArrayList<String>();

    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
    public static final String ELASTICSEARCH = "elasticsearch";

    protected Mediator mediator;    // 中介者

    public AbstractDatabase(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    public abstract void add(String data);
}