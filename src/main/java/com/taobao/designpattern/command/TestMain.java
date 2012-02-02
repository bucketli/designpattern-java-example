package com.taobao.designpattern.command;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:16:33
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Receiver receiver=new Receiver();
	    Command command=new ConcreteCommand(receiver);
	    Invoker invoker=new Invoker();
	    invoker.setCommand(command);
	    invoker.executeCommand();
	}
}
