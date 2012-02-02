package com.taobao.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:19:11
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);

	}

	@Override
	public void remove(Component c) {
		children.remove(c);

	}

	@Override
	public void display(int depth) {
		StringBuilder sb=new StringBuilder();
	    for(int i=0;i<depth;i++){
	    	sb.append("-");
	    }
	    sb.append(name);
	    System.out.println(sb.toString());
		for (Component c : children) {
			c.display(depth + 2);
		}
	}

}
