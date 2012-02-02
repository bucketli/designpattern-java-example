package com.taobao.designpattern.chainofresponsibility;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:09:18
 */
public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(this.getClass().getCanonicalName()
					+ " handled request " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}

	}

}
