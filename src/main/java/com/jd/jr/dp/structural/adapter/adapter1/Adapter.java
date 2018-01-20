package com.jd.jr.dp.structural.adapter.adapter1;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-01-20
 * Time: 5:17 pm
 */
public class Adapter extends Adaptee {

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        System.out.println("adapter...");
    }
}
