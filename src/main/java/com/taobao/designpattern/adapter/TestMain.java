package com.taobao.designpattern.adapter;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç02:06:56
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target target=new Adapter();
		target.request();
	}
}
