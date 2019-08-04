/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.adapter.adapter3;

/**
 *
 * @author benjamin
 * @version $Id: AdapterTest.java, v 0.1 2019年08月04日 4:56 PM benjamin Exp $
 */
public class AdapterTest {

    public static void main(String[] args) {
        DBSocket dbSocket = new SocketAdapter(new GBSocketImpl());
        DHotel dHotel = new DHotel(dbSocket);
        dHotel.charge();
    }
}