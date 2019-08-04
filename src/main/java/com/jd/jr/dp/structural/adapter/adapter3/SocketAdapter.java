/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.adapter.adapter3;

/**
 *
 * @author benjamin
 * @version $Id: SocketAdapter.java, v 0.1 2019年08月04日 4:54 PM benjamin Exp $
 */
public class SocketAdapter implements DBSocket {
    private GBSocket gbSocket;

    public SocketAdapter(GBSocket gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        System.out.println("开始适配");
        gbSocket.powerWithThreeRound();
        System.out.println("适配成功");
    }
}