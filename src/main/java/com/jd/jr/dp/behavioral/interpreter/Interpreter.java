/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.interpreter;

/**
 * 解释器
 *
 * @author benjamin
 * @version $Id: Interpreter.java, v 0.1 2019年08月04日 4:20 PM benjamin Exp $
 */
public interface Interpreter {

    /**
     * 解析
     * @param context
     */
    void parse(Context context);
}