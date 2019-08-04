/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.state;

/**
 * 实现ATM故障状态
 *
 * @author benjamin
 * @version $Id: NoServiceState.java, v 0.1 2019年08月04日 3:06 PM benjamin Exp $
 */
public class NoServiceState implements ATMState {

    private ATM atm;

    public NoServiceState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("插卡失败，机器发生了故障");
    }

    @Override
    public void submitPwd() {
        System.out.println("密码提交失败，机器发生了故障");
    }

    @Override
    public void getCash() {
        System.out.println("取款失败，机器发生了故障");
    }

    @Override
    public void queryBalance() {
        System.out.println("余额查询失败，机器发生了故障");
    }

    @Override
    public void ejectCard() {
        System.out.println("取卡失败，机器发生了故障");
    }
}