/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain2;

/**
 *
 * @author benjamin
 * @version $Id: Engineer.java, v 0.1 2019年08月03日 2:29 PM benjamin Exp $
 */
public abstract class Engineer {

    private Engineer nextEngineer;

    public void setNextEngineer(Engineer nextEngineer) {
        this.nextEngineer = nextEngineer;
    }

    public void approval(int amount) {
        if (needApproval(amount)) {
            approvalInner(amount);
            if (nextEngineer != null) {
                nextEngineer.approval(amount);
            }
        }
    }

    /**
     * 是否需要审批
     * @param amount
     * @return
     */
    public abstract boolean needApproval(int amount);

    /**
     * 审批
     */
    public abstract void approvalInner(int amount);
}