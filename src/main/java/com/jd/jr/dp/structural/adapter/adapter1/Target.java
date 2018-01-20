package com.jd.jr.dp.structural.adapter.adapter1;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-01-20
 * Time: 5:16 pm
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    void sampleOperation2();
}
