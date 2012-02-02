package com.taobao.designpattern.abstractfactory;

import com.taobao.designpattern.abstractfactory.obj.AbstractProductA;
import com.taobao.designpattern.abstractfactory.obj.AbstractProductB;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:32:36
 */
public class Client {
    private AbstractProductA abstractProductA;
    private AbstractProductB abstractProductB;
    
    public Client(AbstractFactory factory){
    	abstractProductA=factory.createProductA();
    	abstractProductB=factory.createProductB();
    }
    
    public void run(){
    	abstractProductB.interact(abstractProductA);
    }
}
