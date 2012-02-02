package com.taobao.designpattern.chainofresponsibility;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:10:38
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		int[] request = { 24, 3, 45, 5, 2, 5, 6, 7, 12, 5, 6 };
		for (Integer i : request) {
			h1.handleRequest(i);
		}
	}
}
