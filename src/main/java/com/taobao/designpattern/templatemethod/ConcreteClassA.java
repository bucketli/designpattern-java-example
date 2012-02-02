package com.taobao.designpattern.templatemethod;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:40:51
 */
public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("ConcreteClassA.primitiveOperation1()");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("ConcreteClassA.primitiveOperation2()");

	}

}
