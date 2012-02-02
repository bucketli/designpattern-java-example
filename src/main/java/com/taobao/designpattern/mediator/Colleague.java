package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:40:21
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
    	this.mediator=mediator;
    }
}
