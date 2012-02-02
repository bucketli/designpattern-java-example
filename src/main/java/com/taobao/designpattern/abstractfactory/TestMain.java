package com.taobao.designpattern.abstractfactory;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:32:05
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory factory1=new ConcreteFactroy1();
		Client c1=new Client(factory1);
		c1.run();
		
		AbstractFactory factory2=new ConcreteFactroy2();
		Client c2=new Client(factory2);
		c2.run();
	}
}
