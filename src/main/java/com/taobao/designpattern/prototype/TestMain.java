package com.taobao.designpattern.prototype;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:36:49
 */
public class TestMain {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype1 p1=new ConcretePrototype1("I");
		ConcretePrototype1 c1=(ConcretePrototype1)p1.clonex();
		System.out.println("Cloned:"+c1.getId());
		
		ConcretePrototype2 p2=new ConcretePrototype2("II");
		ConcretePrototype2 c2=(ConcretePrototype2)p2.clonex();
		System.out.println("Cloned:"+c2.getId());
	}

}
