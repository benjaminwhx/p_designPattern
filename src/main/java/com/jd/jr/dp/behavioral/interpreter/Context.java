/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.interpreter;

/**
 * 文本类
 *
 * @author benjamin
 * @version $Id: Context.java, v 0.1 2019年08月04日 4:19 PM benjamin Exp $
 */
public class Context {
    private String formula; // 公式

    public Context(String formula) {
        this.formula = formula;
    }

    /**
     * Getter method for property <tt>formula</tt>.
     *
     * @return property value of formula
     */
    public String getFormula() {
        return formula;
    }
}