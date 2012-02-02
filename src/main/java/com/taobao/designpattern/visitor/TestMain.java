package com.taobao.designpattern.visitor;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:52:22
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    ObjectStructure o=new ObjectStructure();
	    o.attach(new ConcreteElementA());
	    o.attach(new ConcreteElementB());
	    ConcreteVisitor1 v1=new ConcreteVisitor1();
	    ConcreteVisitor2 v2=new ConcreteVisitor2();
	    o.accept(v1);
	    o.accept(v2);
	}

}
