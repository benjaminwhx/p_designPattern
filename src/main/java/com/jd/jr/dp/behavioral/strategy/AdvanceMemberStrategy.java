package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:37
 * 高级会员折扣类
 */
public class AdvanceMemberStrategy implements MemberStrategy {

    public double calcPrice(double price) {
        System.out.println("对于高级会员打7折");
        return price * 0.7;
    }
}
