package com.taobao.designpattern.interpreter;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:19:58
 */
public class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
	    System.out.println("Called NonterminalExpression.interpret()");
	}
}
