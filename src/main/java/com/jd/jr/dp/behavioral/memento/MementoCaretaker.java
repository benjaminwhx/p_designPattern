/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人角色
 *
 * @author benjamin
 * @version $Id: MementoCaretaker.java, v 0.1 2019年08月04日 10:17 AM benjamin Exp $
 */
public class MementoCaretaker {
    private List<ChessmanMemento> chessmanMementoList = new ArrayList<>();

    public void addMemento(ChessmanMemento chessmanMemento) {
        chessmanMementoList.add(chessmanMemento);
    }

    public ChessmanMemento getMemento(int i) {
        return chessmanMementoList.get(i);
    }
}