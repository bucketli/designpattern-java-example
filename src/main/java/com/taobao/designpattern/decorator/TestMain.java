package com.taobao.designpattern.decorator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:36:43
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteComponent cc=new ConcreteComponent();
		ConcreteDecoratorA d1=new ConcreteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		d1.setComponent(cc);
		d2.setComponent(d1);
		d2.operation();
	}

}
