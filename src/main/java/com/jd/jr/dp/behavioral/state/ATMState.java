/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.state;

/**
 * ATM机状态
 *
 * @author benjamin
 * @version $Id: ATMState.java, v 0.1 2019年08月04日 10:50 AM benjamin Exp $
 */
public interface ATMState {

    /**
     * 插卡
     */
    void insertCard();

    /**
     * 提交密码
     */
    void submitPwd();

    /**
     * 取款
     */
    void getCash();

    /**
     * 查询余额
     */
    void queryBalance();

    /**
     * 取卡
     */
    void ejectCard();

}