package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:39
 */
public class StrategyTest {

    public static void main(String[] args) {
        MemberStrategy advancer = new AdvanceMemberStrategy();
        Price price = new Price(advancer);
        double finalPrice = price.quote(15.88);
        System.out.println("高级会员打折后的价格为: " + finalPrice);
    }
}
