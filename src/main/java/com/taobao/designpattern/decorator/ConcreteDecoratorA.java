package com.taobao.designpattern.decorator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:34:04
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    public void operation(){
    	super.operation();
    	addedState="New State";
    	System.out.println("ConcreteDecoratorA.operation()");
    }
}
