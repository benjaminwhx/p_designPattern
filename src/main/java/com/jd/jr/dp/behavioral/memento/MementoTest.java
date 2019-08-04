/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.memento;

/**
 *
 * @author benjamin
 * @version $Id: MementoTest.java, v 0.1 2019年08月04日 10:19 AM benjamin Exp $
 */
public class MementoTest {

    private static MementoCaretaker caretaker = new MementoCaretaker();
    private static int index = -1;

    /**
     *   棋子<车>：当前位置为：<1, 1>
         棋子<车>：当前位置为：<5, 1>
         棋子<车>：当前位置为：<5, 10>
         ******悔棋******
         棋子<车>：当前位置为：<5, 1>
         ******悔棋******
         棋子<车>：当前位置为：<1, 1>
         ******撤销悔棋******
         棋子<车>：当前位置为：<5, 1>
         ******撤销悔棋******
         棋子<车>：当前位置为：<5, 10>

     * @param args
     */
    public static void main(String[] args) {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setX(5);
        play(chess);
        chess.setY(10);
        play(chess);

        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    /**
     * 下棋，同时保存备忘录
     *
     * @param chessman
     */
    public static void play(Chessman chessman) {
        caretaker.addMemento(chessman.save());
        index++;
        chessman.show();
    }

    /**
     * 悔棋，撤销到上一个备忘录
     *
     * @param chess
     * @param i
     */
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(caretaker.getMemento(i - 1));
        chess.show();
    }

    /**
     * 撤销悔棋，恢复到下一个备忘录
     *
     * @param chess
     * @param i
     */
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(caretaker.getMemento(i + 1));
        chess.show();
    }
}