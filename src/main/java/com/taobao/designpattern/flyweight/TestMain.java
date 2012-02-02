package com.taobao.designpattern.flyweight;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:56:29
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int state=22;
		FlyweightFactory f=new FlyweightFactory();
		Flyweight fx=f.getFlyweight("X");
		fx.operation(--state);
		Flyweight fy=f.getFlyweight("Y");
		fy.operation(--state);
		Flyweight fz=f.getFlyweight("Z");
		fz.operation(--state);
		UnsharedConcreteFlyweight fu=new UnsharedConcreteFlyweight();
		fu.operation(--state);

	}

}
