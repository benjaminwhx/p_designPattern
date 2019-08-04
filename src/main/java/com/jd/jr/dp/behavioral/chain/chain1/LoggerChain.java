/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benjamin
 * @version $Id: LoggerChain.java, v 0.1 2019年08月03日 2:15 PM benjamin Exp $
 */
public class LoggerChain {

    private List<Logger> loggerList = new ArrayList<>();

    public void addLogger(Logger logger) {
        loggerList.add(logger);
    }

    public void log(int logLevel) {
        for (Logger logger : loggerList) {
            if (logger.logLevel() <= logLevel) {
                logger.log();
            }
        }
    }
}