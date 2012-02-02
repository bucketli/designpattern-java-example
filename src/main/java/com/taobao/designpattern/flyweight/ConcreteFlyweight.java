package com.taobao.designpattern.flyweight;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:51:10
 */
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int state) {
	    System.out.println("ConcreteFlyweight:"+state);
	}
}
