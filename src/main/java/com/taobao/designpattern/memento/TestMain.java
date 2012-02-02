package com.taobao.designpattern.memento;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:55:43
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator o=new Originator();
		o.setState("On");
		Caretaker c=new Caretaker();
		c.setMemento(o.createMemento());
		o.setState("Off");
		o.setMemento(c.getMemento());
	}
}
