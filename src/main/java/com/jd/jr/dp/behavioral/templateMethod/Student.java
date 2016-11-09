package com.jd.jr.dp.behavioral.templateMethod;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午2:47
 */
public class Student extends PersonTemplate {

    protected void takeThings() {
        System.out.println("带书包，带上家庭作业和红领巾");
    }

    protected void eatBreakFast() {
        System.out.println("吃妈妈做好的早饭");
    }

    protected void dressUp() {
        System.out.println("穿校服");
    }
}
