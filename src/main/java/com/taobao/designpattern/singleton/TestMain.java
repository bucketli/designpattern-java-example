package com.taobao.designpattern.singleton;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:02:19
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1=Singleton.instance();
		Singleton s2=Singleton.instance();
		if(s1==s2){
			System.out.println("all singleton is the same instance");
		}
	}
}
