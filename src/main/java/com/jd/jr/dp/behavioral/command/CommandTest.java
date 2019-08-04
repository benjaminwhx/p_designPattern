/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.command;

/**
 *
 * @author benjamin
 * @version $Id: CommandTest.java, v 0.1 2019年08月04日 9:45 AM benjamin Exp $
 */
public class CommandTest {

    /**
     *   显示窗口: 功能键设置
         显示功能键:
         F1
         F2
         ------------------------------
         点击功能键F1
         显示帮助文档!
         点击功能键F2
         将窗口最小化至托盘!

     * @param args
     */
    public static void main(String[] args) {
        FBSettingWindow window = new FBSettingWindow("功能键设置");
        FunctionButton fb1 = new FunctionButton("F1");
        FunctionButton fb2 = new FunctionButton("F2");

        Command c1 = new HelpCommand();
        Command c2 = new MinimizeCommand();

        fb1.setCommand(c1);
        fb2.setCommand(c2);

        window.addFunctionButton(fb1);
        window.addFunctionButton(fb2);
        window.display();

        fb1.onClick();
        fb2.onClick();
    }
}