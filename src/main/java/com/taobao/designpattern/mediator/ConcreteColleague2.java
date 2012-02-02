package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:44:03
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message){
		mediator.send(message,this);
	}
	
	public void unotify(String message){
		System.out.println("Colleague2 gets message:"+message);
	}

}
