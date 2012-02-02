package com.taobao.designpattern.factorymethod;

import com.taobao.designpattern.factorymethod.obj.ConcreteProductA;
import com.taobao.designpattern.factorymethod.obj.Product;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:25:51
 */
public class ConcreteCreatorA extends Creator {
	@Override
	public Product factroyMethod() {
		return new ConcreteProductA();
	}
}
