/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benjamin
 * @version $Id: PropertyTokenizerTest.java, v 0.1 2019年04月08日 6:21 PM benjamin Exp $
 */
public class PropertyTokenizerTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("张三");
        Student s2 = new Student("李四");
        Student s3 = new Student("王五");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Teacher teacher = new Teacher("张老师", students);

        BeanWrapper beanWrapper = new BeanWrapper();
        System.out.println(beanWrapper.get(new PropertyTokenizer("students[1].name"), teacher));
    }

    static class Teacher {
        private String name;
        private List<Student> students;

        public Teacher(String name, List<Student> students) {
            this.name = name;
            this.students = students;
        }
    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }
    }
}