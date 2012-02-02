package com.taobao.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:59:38
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<Observer>();
    
    public void attach(Observer observer){
    	observers.add(observer);
    }
    
    public void detach(Observer observer){
    	observers.remove(observer);
    }
    
    public void unotify(){
    	for(Observer o:observers){
    		o.update();
    	}
    }
}
