package com.taobao.designpattern.decorator;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:31:42
 */
public class ConcreteComponent extends Component {
	@Override
	public void operation() {
		System.out.println("ConcreteComponent.operation()");
	}
}
