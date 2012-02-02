package com.taobao.designpattern.memento;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:53:46
 */
public class Originator {
    private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("State="+state);
		this.state = state;
	}
    
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void setMemento(Memento memento){
		System.out.println("Restoring state:State="+memento.getState());
		state=memento.getState();
	}
}
