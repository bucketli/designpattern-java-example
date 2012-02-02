package com.taobao.designpattern.bridge;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:12:44
 */
public class RefinedAbstraction extends Abstraction {

	@Override
	public void operation() {
		implementor.operation();
	}
}
