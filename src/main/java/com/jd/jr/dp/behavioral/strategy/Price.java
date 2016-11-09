package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:38
 */
public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据对应的策略计算商品的价格
     * @param price
     * @return
     */
    public double quote(double price) {
        return strategy.calcPrice(price);
    }
}
