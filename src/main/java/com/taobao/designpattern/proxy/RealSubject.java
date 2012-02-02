package com.taobao.designpattern.proxy;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:01:15
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}

}
