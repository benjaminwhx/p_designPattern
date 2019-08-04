/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain1;

/**
 *
 * @author benjamin
 * @version $Id: LoggerTest.java, v 0.1 2019年08月03日 2:25 PM benjamin Exp $
 */
public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Logger logger2 = new FileLogger();
        Logger logger3 = new ErrorLogger();
        LoggerChain chain = new LoggerChain();
        chain.addLogger(logger);
        chain.addLogger(logger2);
        chain.addLogger(logger3);
        chain.log(2);
    }
}