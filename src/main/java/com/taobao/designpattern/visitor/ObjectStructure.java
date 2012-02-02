package com.taobao.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:45:50
 */
public class ObjectStructure {
    private List<Element> elements=new ArrayList<Element>();
    
    public void attach(Element element){
    	elements.add(element);
    }
    
    public void detach(Element element){
    	elements.remove(element);
    }
    
    public void accept(Visitor visitor){
    	for(Element e:elements){
    		e.accept(visitor);
    	}
    }
}
