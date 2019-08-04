/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.structural.bridge;

/**
 *
 * @author benjamin
 * @version $Id: BridgeTest.java, v 0.1 2019年08月04日 6:23 PM benjamin Exp $
 */
public class BridgeTest {

    public static void main(String[] args) {
        Software appStore = new Appstore();
        Software camera = new Camera();
        Phone vivo = new Vivo();
        vivo.setSoftware(appStore);
        Phone oppo = new Oppo();
        oppo.setSoftware(camera);
        vivo.run();
        oppo.run();
    }
}