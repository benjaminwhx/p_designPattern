/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain2;

/**
 *
 * @author benjamin
 * @version $Id: EngineerTest.java, v 0.1 2019年08月03日 2:33 PM benjamin Exp $
 */
public class EngineerTest {

    public static void main(String[] args) {
        Engineer p6 = new P6Engineer();
        Engineer p7 = new P7Engineer();
        Engineer p8 = new P8Engineer();
        p6.setNextEngineer(p7);
        p7.setNextEngineer(p8);
        p6.approval(100000);
    }
}