package com.taobao.designpattern.adapter;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:05:29
 */
public class Adapter implements Target {
	private Adaptee adaptee=new Adaptee();
	public void request() {
		adaptee.specificRequest();
	}

}
