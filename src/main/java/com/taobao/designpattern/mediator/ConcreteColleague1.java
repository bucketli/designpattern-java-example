package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:42:33
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message){
		mediator.send(message,this);
	}
	
	public void unotify(String message){
		System.out.println("Colleague1 gets message:"+message);
	}
}
