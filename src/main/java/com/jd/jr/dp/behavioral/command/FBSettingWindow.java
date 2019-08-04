/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 *
 * @author benjamin
 * @version $Id: FBSettingWindow.java, v 0.1 2019年08月04日 9:37 AM benjamin Exp $
 */
public class FBSettingWindow {
    private String title;   // 窗口标题
    private List<FunctionButton> functionButtonList = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtonList.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtonList.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口: " + this.title);
        System.out.println("显示功能键: ");
        functionButtonList.forEach(fb -> {
            System.out.println(fb.getName());
        });
        System.out.println("------------------------------");
    }
}