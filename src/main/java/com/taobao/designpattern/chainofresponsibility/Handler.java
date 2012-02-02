package com.taobao.designpattern.chainofresponsibility;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:04:32
 */
public abstract class Handler {
    protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
   
	public abstract void handleRequest(int request);
}
