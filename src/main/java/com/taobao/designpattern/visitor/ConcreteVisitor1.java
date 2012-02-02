package com.taobao.designpattern.visitor;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:49:19
 */
public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()
				+ " visited by " + this.getClass().getSimpleName());

	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()
				+ " visited by " + this.getClass().getSimpleName());

	}

}
