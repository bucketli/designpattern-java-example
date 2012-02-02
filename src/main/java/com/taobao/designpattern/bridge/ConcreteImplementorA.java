package com.taobao.designpattern.bridge;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:13:58
 */
public class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		System.out.println("ConcreteImplementorA operation");
	}

}
