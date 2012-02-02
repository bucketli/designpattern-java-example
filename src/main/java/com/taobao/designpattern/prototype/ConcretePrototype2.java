package com.taobao.designpattern.prototype;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:33:36
 */
public class ConcretePrototype2 extends Prototype {

	public ConcretePrototype2(String id) {
		super(id);
	}

	@Override
	public Prototype clonex() throws CloneNotSupportedException {
		return (Prototype) this.clone();
	}

}
