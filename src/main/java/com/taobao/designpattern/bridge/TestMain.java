package com.taobao.designpattern.bridge;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:15:29
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Abstraction ab=new RefinedAbstraction();
	    ab.setImplementor(new ConcreteImplementorA());
	    ab.operation();
	    ab.setImplementor(new ConcreteImplementorB());
	    ab.operation();
	}
}
