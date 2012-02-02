package com.taobao.designpattern.templatemethod;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:42:15
 */
public class TestMain {
    public static void main(String[] args){
    	AbstractClass c;
    	c=new ConcreteClassA();
    	c.templateMethod();
    	c=new ConcreteClassB();
    	c.templateMethod();
    }
}
