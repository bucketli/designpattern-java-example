package com.taobao.designpattern.prototype;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:32:01
 */
public class ConcretePrototype1 extends Prototype{

	public ConcretePrototype1(String id) {
		super(id);
	}

	@Override
	public Prototype clonex() throws CloneNotSupportedException {
		return (Prototype)this.clone();
	}
}
