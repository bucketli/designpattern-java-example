package com.taobao.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ02:53:01
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights=new HashMap<String, Flyweight>();
    
    public FlyweightFactory(){
    	flyweights.put("X", new ConcreteFlyweight());
    	flyweights.put("Y", new ConcreteFlyweight());
    	flyweights.put("Z", new ConcreteFlyweight());
    }
    
    public Flyweight getFlyweight(String key){
    	return flyweights.get(key);
    }
}
