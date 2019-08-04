/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.adapter.adapter3;

/**
 * 德国旅馆
 *
 * @author benjamin
 * @version $Id: DHotel.java, v 0.1 2019年08月04日 4:53 PM benjamin Exp $
 */
public class DHotel {
    private DBSocket dbSocket;

    public DHotel(DBSocket dbSocket) {
        this.dbSocket = dbSocket;
    }

    /**
     * 充电
     */
    public void charge() {
        dbSocket.powerWithTwoRound();
    }
}