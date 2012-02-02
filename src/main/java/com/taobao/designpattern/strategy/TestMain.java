package com.taobao.designpattern.strategy;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:37:38
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.contextInterface();
		context=new Context(new ConcreteStrategyB());
		context.contextInterface();
		context=new Context(new ConcreteStrategyC());
		context.contextInterface();	
	}
}
