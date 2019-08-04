/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.state;

/**
 * 无钞状态
 *
 * @author benjamin
 * @version $Id: NoCashState.java, v 0.1 2019年08月04日 10:52 AM benjamin Exp $
 */
public class NoCashState implements ATMState {

    private ATM atm;

    public NoCashState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡完成");
    }

    @Override
    public void submitPwd() {
        System.out.println("密码提交完成");
        if ("123".equals(atm.getPwd())) {
            System.out.println("密码输入正确");
        } else {
            System.out.println("密码输入失败");
            ejectCard();    // 弹出卡片
        }
    }

    @Override
    public void getCash() {
        System.out.println("取款失败，机内无钞");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额￥" + atm.getBalance());
        System.out.println("余额查询完成");
    }

    @Override
    public void ejectCard() {
        System.out.println("取卡完成");
    }
}