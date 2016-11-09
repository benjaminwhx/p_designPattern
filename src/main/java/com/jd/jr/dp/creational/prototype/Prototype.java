package com.jd.jr.dp.creational.prototype;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午0:01
 */
public abstract class Prototype implements Cloneable {

    /**
     * 克隆自身方法
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
