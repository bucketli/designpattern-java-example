package com.taobao.designpattern.iterator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:36:21
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteAggregate a=new ConcreteAggregate();
		a.set("Item A");
		a.set("Item B");
		a.set("Item C");
		a.set("Item D");
		
		ConcreteIterator i=new ConcreteIterator(a);
		System.out.println("Iterating over collection:");
		Object item=i.first();
		while(item!=null){
			System.out.println(item);
			item=i.next();
		}
	}
}
