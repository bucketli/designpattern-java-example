package com.taobao.designpattern.command;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:15:19
 */
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();

	}

}
