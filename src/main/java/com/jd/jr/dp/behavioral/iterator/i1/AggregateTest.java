/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i1;

/**
 *
 * @author benjamin
 * @version $Id: AggregateTest.java, v 0.1 2019年04月08日 4:10 PM benjamin Exp $
 */
public class AggregateTest {

    public static void main(String[] args) {
        Object[] objArray = new Object[] {"A", "B", "C"};
        Aggregate aggregate = new ConcreteAggregate(objArray);
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}