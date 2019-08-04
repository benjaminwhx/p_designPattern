/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.interpreter;

/**
 * 减法
 *
 * @author benjamin
 * @version $Id: Subtract.java, v 0.1 2019年08月04日 4:20 PM benjamin Exp $
 */
public class Subtract implements Interpreter {

    @Override
    public void parse(Context context) {
        if (context.getFormula().indexOf("-") != -1) {
            String str = context.getFormula();
            int start = str.indexOf("-");
            String str1 = str.substring(0, start);
            String str2 = str.substring(start + 1);
            System.out.println(context.getFormula() + " = " + (Integer.parseInt(str1.trim()) - Integer.parseInt(str2.trim())));
        }
    }
}