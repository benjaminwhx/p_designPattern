/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.observer.o2;

/**
 *
 * @author benjamin
 * @version $Id: ObserverTest.java, v 0.1 2019年04月08日 11:58 AM benjamin Exp $
 */
public class ObserverTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("张三");
        Student student2 = new Student("李四");
        Student student3 = new Student("王五");
        teacher.addObserver(student1);
        teacher.addObserver(student2);
        teacher.addObserver(student3);
        teacher.setHomework("数学第8页");

        System.out.println("------------");
        teacher.deleteObserver(student1);
        teacher.setHomework("语文第5页");
    }
}