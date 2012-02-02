package com.taobao.designpattern.command;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:15:48
 */
public class Invoker {
    private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
    
	public void executeCommand(){
		command.execute();
	}
}
