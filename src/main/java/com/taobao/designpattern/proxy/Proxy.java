package com.taobao.designpattern.proxy;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:01:47
 */
public class Proxy extends Subject {
    private RealSubject realSubject;
    
	@Override
	public void request() {
		if(this.realSubject==null){
			realSubject=new RealSubject();
		}
		
		System.out.println("before RealSubject.request()");
		realSubject.request();
		System.out.println("after RealSubject.request()");
	}
}
