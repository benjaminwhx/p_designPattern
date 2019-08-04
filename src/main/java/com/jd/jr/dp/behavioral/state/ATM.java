/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/**
 * ATM机
 *
 * @author benjamin
 * @version $Id: ATM.java, v 0.1 2019年08月04日 10:52 AM benjamin Exp $
 */
@Getter
@Setter
public class ATM {
    private ATMState readyState;
    private ATMState noCashState;
    private ATMState noServiceState;

    private ATMState currState; // 当前状态
    private int      totalAmount;    // 机内现钞总数
    private String   pwd; // 密码
    private int      balance;    // 余额
    private int      amount; // 取款金额

    public ATM(int totalAmount, int balance, int amount, String pwd) throws Exception {
        //初始化所有状态
        readyState = new ReadyState(this);
        noCashState = new NoCashState(this);
        noServiceState = new NoServiceState(this);

        if (totalAmount > 0) {
            currState = readyState;
        } else if (totalAmount == 0) {
            currState = noCashState;
        } else {
            throw new Exception();
        }

        //初始化测试数据
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.amount = amount;
        this.pwd = pwd;
    }

    /*把具体行为委托给状态对象*/
    /**
     * 插卡
     */
    public void insertCard(){
        currState.insertCard();
    }

    /**
     * 提交密码
     */
    public void submitPwd(){
        currState.submitPwd();
    }

    /**
     * 取款
     */
    public void getCash(){
        currState.getCash();
    }

    /**
     * 查询余额
     */
    public void queryBalance(){
        currState.queryBalance();
    }

    /**
     * 取卡
     */
    public void ejectCard(){
        currState.ejectCard();
    }

    @Override
    public String toString(){
        return "现钞总数￥" + totalAmount;
    }
}