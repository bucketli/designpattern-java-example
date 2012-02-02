package com.taobao.designpattern.facade;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:44:29
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Facade facade=new Facade();
	    facade.methodA();
	    facade.methodB();
	}
}
