package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:42:01
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;
    
	@Override
	public void send(String message, Colleague colleague) {
		if(colleague==colleague1){
			colleague2.unotify(message);
		}else{
			colleague1.unotify(message);
		}
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}	
}
