package com.taobao.designpattern.builder;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÉÏÎç11:46:19
 */
public class Director {
    public void construct(Builder builder){
    	builder.buildPartA();
    	builder.buildPartB();
    }
}
