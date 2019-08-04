/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.facade;

/**
 *
 * @author benjamin
 * @version $Id: FacadeTest.java, v 0.1 2019年08月04日 5:32 PM benjamin Exp $
 */
public class FacadeTest {

    /**
     *   股票买入
         国税买入
         房地产买入
         --------------
         股票卖出
         国税卖出
         房地产卖出

     * @param args
     */
    public static void main(String[] args) {
        IFund fund = new FundImpl();
        fund.buy();
        System.out.println("--------------");
        fund.sell();
    }
}