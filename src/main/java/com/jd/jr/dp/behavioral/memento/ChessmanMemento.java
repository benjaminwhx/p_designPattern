/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.memento;

/**
 * 棋子备忘录角色
 *
 * @author benjamin
 * @version $Id: ChessmanMemento.java, v 0.1 2019年08月04日 10:14 AM benjamin Exp $
 */
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * Getter method for property <tt>label</tt>.
     *
     * @return property value of label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Getter method for property <tt>x</tt>.
     *
     * @return property value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Getter method for property <tt>y</tt>.
     *
     * @return property value of y
     */
    public int getY() {
        return y;
    }
}