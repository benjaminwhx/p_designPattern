package com.jd.jr.dp.behavioral.templateMethod;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午2:48
 */
public class Teacher extends PersonTemplate {

    protected void takeThings() {
        System.out.println("带上昨晚准备的考卷");
    }

    protected void eatBreakFast() {
        System.out.println("做早饭，照顾孩子吃早饭");
    }

    protected void dressUp() {
        System.out.println("穿工作服");
    }
}
