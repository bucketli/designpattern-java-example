package com.taobao.designpattern.decorator;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:32:38
 */
public abstract class Decorator extends Component {
    protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}
    
	public void operation(){
		if(component!=null){
			component.operation();
		}
	}
}
