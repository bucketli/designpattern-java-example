package com.taobao.designpattern.abstractfactory.obj;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:25:11
 */
public class ProductB2 extends AbstractProductB {
	public void interact(AbstractProductA a) {
		System.out.println(this.getClass().getName() + " interacts with "
				+ a.getClass().getName());
	}
}
