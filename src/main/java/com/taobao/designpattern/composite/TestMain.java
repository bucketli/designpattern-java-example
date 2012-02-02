package com.taobao.designpattern.composite;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:26:43
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		Composite comp=new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		root.add(comp);
		root.add(new Leaf("Leaf C"));
		Leaf leaf=new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		root.display(1);
	}

}
