package com.taobao.designpattern.bridge;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:10:42
 */
public class Abstraction {
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void operation() {
		implementor.operation();
	}
}
