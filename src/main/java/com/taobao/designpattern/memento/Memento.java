package com.taobao.designpattern.memento;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:51:45
 */
public class Memento {
    private String state;
    public Memento(String state){
    	this.state=state;
    }
	public String getState() {
		return state;
	}
}
