/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author benjamin
 * @version $Id: FlyweightFactory.java, v 0.1 2019年08月04日 9:11 PM benjamin Exp $
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweightMap.containsKey(key)) {
            System.out.println("具体享元" + key + "已存在，被成功获取!");
            return flyweightMap.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
            return flyweight;
        }
    }
}