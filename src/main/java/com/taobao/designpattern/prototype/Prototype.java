package com.taobao.designpattern.prototype;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ01:30:27
 */
public abstract class Prototype implements Cloneable{
    private String id;
    public Prototype(String id){
    	this.id=id;
    }
	public String getId() {
		return id;
	}
    
	public abstract Prototype clonex() throws CloneNotSupportedException;
}
