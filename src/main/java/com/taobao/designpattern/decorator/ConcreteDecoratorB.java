package com.taobao.designpattern.decorator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:35:29
 */
public class ConcreteDecoratorB extends Decorator {
     public void operation(){
    	 super.operation();
    	 this.addedBehavior();
    	 System.out.println("ConcreteDecoratorB.operation()");
     }
     
     void addedBehavior(){
    	 
     }
}
