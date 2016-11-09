package com.jd.jr.dp.behavioral.strategy;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:37
 * 中级会员折扣类
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    public double calcPrice(double price) {
        System.out.println("对于中级会员的折扣为9折");
        return price * 0.9;
    }
}
