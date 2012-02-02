package com.taobao.designpattern.observer;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç04:02:47
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;
    
    public ConcreteObserver(ConcreteSubject subject,String name){
    	this.subject=subject;
    	this.name=name;
    }
	@Override
	public void update() {
		observerState=subject.getSubjectState();
		System.out.println("Observer "+name+"'s new state is "+observerState);
	}
	public ConcreteSubject getSubject() {
		return subject;
	}
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
}
