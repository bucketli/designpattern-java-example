package com.taobao.designpattern.builder;

import com.taobao.designpattern.builder.obj.Product;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:44:54
 */
public class ConcreteBuilder2 extends Builder {
    private Product product=new Product();
    
	@Override
	public void buildPartA() {
		product.add("PartX");
	}

	@Override
	public void buildPartB() {
		product.add("PartY");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
