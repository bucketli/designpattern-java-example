package com.taobao.designpattern.iterator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:25:49
 */
public class ConcreteIterator extends Iterator<Object> {
    private ConcreteAggregate aggregate;
    private int current=0;
    
    public ConcreteIterator(ConcreteAggregate a){
    	this.aggregate=a;
    }
	@Override
	public Object first() {
	    return this.aggregate.get(0);
	}

	@Override
	public Object next() {
		Object ret=null;
		if(current<aggregate.getCount()-1){
			ret=aggregate.get(++current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current>=aggregate.getCount()?true:false;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
