package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:36
 * 初级会员策略类
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    public double calcPrice(double price) {
        System.out.println("对于初级会员没有折扣");
        return price;
    }
}
