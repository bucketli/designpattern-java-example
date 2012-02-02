package com.taobao.designpattern.templatemethod;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:39:22
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    
    public void templateMethod(){
    	primitiveOperation1();
    	primitiveOperation2();
    	System.out.println("");
    }
}
