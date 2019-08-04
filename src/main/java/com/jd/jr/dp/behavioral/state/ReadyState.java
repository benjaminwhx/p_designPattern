/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.state;

/**
 * 就绪状态
 *
 * @author benjamin
 * @version $Id: ReadyState.java, v 0.1 2019年08月04日 10:52 AM benjamin Exp $
 */
public class ReadyState implements ATMState {

    private ATM atm;

    public ReadyState(ATM atm) {
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
        if (atm.getTotalAmount() >= atm.getAmount() && atm.getBalance() >= atm.getAmount()) {
            atm.setBalance(atm.getBalance() - atm.getAmount());
            atm.setTotalAmount(atm.getTotalAmount() - atm.getAmount());
            System.out.println("吐出￥" + atm.getAmount());
            System.out.println("取款完成");
            ejectCard();    // 弹出卡片
            if (atm.getTotalAmount() == 0) {
                atm.setCurrState(atm.getNoCashState());
                System.out.println("无钞信息已经发送至银行");
            }
        } else {
            System.out.println("取款失败，余额不足");
            ejectCard();
        }
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