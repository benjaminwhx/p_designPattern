/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain2;

/**
 *
 * @author benjamin
 * @version $Id: P8Engineer.java, v 0.1 2019年08月03日 2:32 PM benjamin Exp $
 */
public class P8Engineer extends Engineer {

    @Override
    public boolean needApproval(int amount) {
        return amount > 10000;
    }

    @Override
    public void approvalInner(int amount) {
        System.out.println("高级技术专家审批");
    }
}