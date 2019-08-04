/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.command;

/**
 * 最小化命令类：具体命令类
 *
 * @author benjamin
 * @version $Id: MinimizeCommand.java, v 0.1 2019年08月04日 9:34 AM benjamin Exp $
 */
public class MinimizeCommand implements Command {

    // 维持对请求接收者的引用
    private WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    // 命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        windowHandler.minimize();
    }
}