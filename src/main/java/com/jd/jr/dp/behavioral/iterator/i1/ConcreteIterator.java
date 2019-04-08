/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i1;

/**
 *
 * @author benjamin
 * @version $Id: ConcreteIterator.java, v 0.1 2019年04月08日 1:55 PM benjamin Exp $
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;

    /**
     * 内部索引，记录当前迭代到的索引位置
     */
    private int index = 0;

    /**
     * 记录当前索引对象的大小
     */
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        if (this.index < this.size) {
            this.index++;
        }
    }

    @Override
    public boolean isDone() {
        return this.index >= this.size;
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(this.index);
    }
}