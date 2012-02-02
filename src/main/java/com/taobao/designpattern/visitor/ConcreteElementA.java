package com.taobao.designpattern.visitor;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:45:11
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
	    visitor.visitConcreteElementA(this);
	}
	
	public void operationA(){
		
	}
}
