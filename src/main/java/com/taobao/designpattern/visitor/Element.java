package com.taobao.designpattern.visitor;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:44:21
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
