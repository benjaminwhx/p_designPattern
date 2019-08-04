/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.facade;

/**
 *
 * @author benjamin
 * @version $Id: FundImpl.java, v 0.1 2019年08月04日 5:29 PM benjamin Exp $
 */
public class FundImpl implements IFund {
    private Stock stock = new Stock();
    private NationalDebt nationalDebt = new NationalDebt();
    private Realty realty = new Realty();

    @Override
    public void buy() {
        stock.buy();
        nationalDebt.buy();
        realty.buy();
    }

    @Override
    public void sell() {
        stock.sell();
        nationalDebt.sell();
        realty.sell();
    }
}