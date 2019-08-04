/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.chain.chain1;

/**
 * @author benjamin
 * @version $Id: Logger.java, v 0.1 2019年08月03日 2:16 PM benjamin Exp $
 */
public interface Logger {

    int DEBUG  = 1;   // 一级日志
    int INFO = 2;  // 二级日志
    int ERROR = 3;  // 三级日志

    void log();

    int logLevel();
}