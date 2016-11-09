package com.jd.jr.dp.behavioral.templateMethod;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午2:43
 */
public abstract class PersonTemplate implements SchoolPerson {

    /**
     * 实现方法，模板方法不允许重写定义为final
     */
    public final void prepareGoToScholl() {
        dressUp();
        eatBreakFast();
        takeThings();
    }

    // 以下是不同子类根据自身特性完成的具体步骤
    protected abstract void takeThings();

    protected abstract void eatBreakFast();

    protected abstract void dressUp();
}
