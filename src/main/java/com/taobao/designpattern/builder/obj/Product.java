package com.taobao.designpattern.builder.obj;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:38:35
 */
public class Product {
    private List<String> parts=new ArrayList<String>();
    public void add(String part){
    	parts.add(part);
    }
    
    public void show(){
    	StringBuilder sb=new StringBuilder("product parts:");
    	for(String part:parts){
    		sb.append(" ");
    		sb.append(part);
    		sb.append(" ");
    	}
    	System.out.println(sb.toString());
    }
}
