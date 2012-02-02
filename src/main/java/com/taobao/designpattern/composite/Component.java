package com.taobao.designpattern.composite;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:17:48
 */
public abstract class Component {
    protected String name;
    public Component(String name){
    	this.name=name;
    }
    
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
