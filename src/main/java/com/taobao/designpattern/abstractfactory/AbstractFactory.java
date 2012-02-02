package com.taobao.designpattern.abstractfactory;

import com.taobao.designpattern.abstractfactory.obj.AbstractProductA;
import com.taobao.designpattern.abstractfactory.obj.AbstractProductB;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ионГ11:25:30
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
