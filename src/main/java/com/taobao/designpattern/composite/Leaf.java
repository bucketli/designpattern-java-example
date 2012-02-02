package com.taobao.designpattern.composite;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:22:30
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void display(int depth) {
		StringBuilder sb=new StringBuilder();
	    for(int i=0;i<depth;i++){
	    	sb.append("-");
	    }
	    sb.append(name);
		System.out.println(sb.toString());
	}
}
