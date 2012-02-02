package com.taobao.designpattern.builder;

import com.taobao.designpattern.builder.obj.Product;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:43:26
 */
public class ConcreteBuilder1 extends Builder {

	private Product product=new Product();
	
	@Override
	public void buildPartA() {
		product.add("PartA");
	}

	@Override
	public void buildPartB() {
		product.add("PartB");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
