/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.command;

/**
 * 功能键类：请求发送者
 *
 * @author benjamin
 * @version $Id: FunctionButton.java, v 0.1 2019年08月04日 9:35 AM benjamin Exp $
 */
public class FunctionButton {
    private String name;    // 功能键名称
    private Command command;    // 维持一个命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>command</tt>.
     *
     * @param command value to be assigned to property command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 发送请求的方法
     */
    public void onClick() {
        System.out.println("点击功能键" + name);
        command.execute();
    }
}