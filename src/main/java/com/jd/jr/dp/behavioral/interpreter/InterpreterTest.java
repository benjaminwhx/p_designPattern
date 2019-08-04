/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.interpreter;

/**
 *
 * @author benjamin
 * @version $Id: InterpreterTest.java, v 0.1 2019年08月04日 4:27 PM benjamin Exp $
 */
public class InterpreterTest {

    /**
     *  1 + 2 = 3
        1 - 2 = -1

     * @param args
     */
    public static void main(String[] args) {
        Interpreter add = new Add();
        add.parse(new Context("1 + 2"));
        Interpreter subtract = new Subtract();
        subtract.parse(new Context("1 - 2"));
    }
}