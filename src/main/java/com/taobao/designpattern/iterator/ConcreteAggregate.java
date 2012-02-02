package com.taobao.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:25:24
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items=new ArrayList<Object>();
    
	@Override
	public ConcreteIterator createIterator() {
		return new ConcreteIterator(this);
	}
	
    public int getCount(){
    	return this.items.size();
    }
    
    public Object get(int index){
    	return this.items.get(index);
    }
    
    public void set(Object element){
    	this.items.add(element);
    }
}
