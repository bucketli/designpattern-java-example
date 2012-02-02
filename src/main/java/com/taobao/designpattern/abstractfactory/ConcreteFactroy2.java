package com.taobao.designpattern.abstractfactory;

import com.taobao.designpattern.abstractfactory.obj.AbstractProductA;
import com.taobao.designpattern.abstractfactory.obj.AbstractProductB;
import com.taobao.designpattern.abstractfactory.obj.ProductA2;
import com.taobao.designpattern.abstractfactory.obj.ProductB2;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:28:10
 */
public class ConcreteFactroy2 extends AbstractFactory {
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
