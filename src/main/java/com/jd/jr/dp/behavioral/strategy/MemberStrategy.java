package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:35
 * 会员策略
 */
public interface MemberStrategy {

    /**
     * 根据会员的策略计算商品的价格
     * @param price
     * @return
     */
    double calcPrice(double price);
}
