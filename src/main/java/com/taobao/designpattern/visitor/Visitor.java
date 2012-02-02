package com.taobao.designpattern.visitor;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:44:04
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
