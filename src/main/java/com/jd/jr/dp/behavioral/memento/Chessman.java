/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.memento;

/**
 * 棋子类
 *
 * @author benjamin
 * @version $Id: Chessman.java, v 0.1 2019年08月04日 10:12 AM benjamin Exp $
 */
public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * Setter method for property <tt>label</tt>.
     *
     * @param label value to be assigned to property label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Setter method for property <tt>x</tt>.
     *
     * @param x value to be assigned to property x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Setter method for property <tt>y</tt>.
     *
     * @param y value to be assigned to property y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 保存状态
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(label, x, y);
    }

    /**
     * 恢复状态
     *
     * @param chessmanMemento
     */
    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

    public void show() {
        System.out.println(String.format("棋子<%s>：当前位置为：<%d, %d>", this.label, this.x, this.y));
    }
}