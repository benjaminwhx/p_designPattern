/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.command;

/**
 * 帮助命令类
 *
 * @author benjamin
 * @version $Id: HelpCommand.java, v 0.1 2019年08月04日 9:32 AM benjamin Exp $
 */
public class HelpCommand implements Command {

    //维持对请求接收者的引用
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        helpHandler.display();
    }
}