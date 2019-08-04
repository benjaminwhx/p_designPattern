/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain1;

/**
 *
 * @author benjamin
 * @version $Id: ConsoleLogger.java, v 0.1 2019年08月03日 2:18 PM benjamin Exp $
 */
public class ConsoleLogger implements Logger {

    @Override
    public void log() {
        System.out.println("console log!");
    }

    @Override
    public int logLevel() {
        return DEBUG;
    }
}