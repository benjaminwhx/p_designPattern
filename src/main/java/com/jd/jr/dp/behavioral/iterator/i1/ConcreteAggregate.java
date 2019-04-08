/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i1;

/**
 *
 * @author benjamin
 * @version $Id: ConcreteAggregate.java, v 0.1 2019年04月08日 1:56 PM benjamin Exp $
 */
public class ConcreteAggregate implements Aggregate {

    private Object[] objArray;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if (index <0 || index >= objArray.length) {
            throw new IllegalArgumentException("参数非法");
        }
        return objArray[index];
    }

    public int size() {
        return objArray.length;
    }
}