package com.taobao.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:20:35
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context=new Context();
		List<AbstractExpression> list=new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		for(AbstractExpression e:list){
			e.interpret(context);
		}
	}

}
