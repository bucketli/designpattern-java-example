package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:47:36
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteMediator m=new ConcreteMediator();
		ConcreteColleague1 c1=new ConcreteColleague1(m);
		ConcreteColleague2 c2=new ConcreteColleague2(m);
		m.setColleague1(c1);
		m.setColleague2(c2);
		c1.send("How are you?");
		c2.send("fine,thanks");
	}

}
