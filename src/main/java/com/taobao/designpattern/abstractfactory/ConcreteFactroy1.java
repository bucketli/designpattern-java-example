package com.taobao.designpattern.abstractfactory;

import com.taobao.designpattern.abstractfactory.obj.AbstractProductA;
import com.taobao.designpattern.abstractfactory.obj.AbstractProductB;
import com.taobao.designpattern.abstractfactory.obj.ProductA1;
import com.taobao.designpattern.abstractfactory.obj.ProductB1;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:27:11
 */
public class ConcreteFactroy1 extends AbstractFactory {
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
