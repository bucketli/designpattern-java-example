package com.taobao.designpattern.singleton;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:00:30
 */
public class Singleton {
    private static Singleton instance;
    
    protected Singleton(){
    	
    }
    
    public static Singleton instance(){
    	if(instance==null){
    		instance=new Singleton();
    	}
    	
    	return instance;
    }
}
