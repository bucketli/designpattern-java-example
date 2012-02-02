package com.taobao.designpattern.factorymethod;

import com.taobao.designpattern.factorymethod.obj.Product;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:27:18
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Creator[] creators=new Creator[2];
		creators[0]=new ConcreteCreatorA();
		creators[1]=new ConcreteCreatorB();
		for(Creator c:creators){
			Product product=c.factroyMethod();
			System.out.println("Created "+product.getClass().getName());
		}
	}

}
