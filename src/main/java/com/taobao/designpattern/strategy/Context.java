package com.taobao.designpattern.strategy;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:36:35
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
    	this.strategy=strategy;
    }
    
    public void contextInterface(){
    	this.strategy.algorithmInterface();
    }
}
