/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.facade;

/**
 * 基金接口
 *
 * @author benjamin
 * @version $Id: IFund.java, v 0.1 2019年08月04日 5:29 PM benjamin Exp $
 */
public interface IFund {

    /**
     * 买入
     */
    void buy();

    /**
     * 卖出
     */
    void sell();
}