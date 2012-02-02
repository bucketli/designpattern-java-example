package com.taobao.designpattern.observer;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:05:38
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    ConcreteSubject s=new ConcreteSubject();
	    s.attach(new ConcreteObserver(s, "X"));
	    s.attach(new ConcreteObserver(s, "Y"));
	    s.attach(new ConcreteObserver(s, "Z"));
	    
	    s.setSubjectState("ABC");
	    s.unotify();
	}
}
