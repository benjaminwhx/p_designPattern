package com.jd.jr.dp.creational.builder;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午7:13
 * 博客地址：http://www.importnew.com/11506.html
 */
public class BuilderTest {

    public static void main(String[] args) {
        User user = new User.UserBuilder("wu", "haixu").
                age(21).phone("18888888888").address("beijing").
                build();
    }
}
