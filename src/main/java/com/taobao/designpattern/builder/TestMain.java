package com.taobao.designpattern.builder;

import com.taobao.designpattern.builder.obj.Product;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:47:17
 */
public class TestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Director director=new Director();
        Builder b1=new ConcreteBuilder1();
        Builder b2=new ConcreteBuilder2();
        director.construct(b1);
        Product d1=b1.getResult();
        d1.show();
        director.construct(b2);
        Product d2=b2.getResult();
        d2.show();
	}
}
