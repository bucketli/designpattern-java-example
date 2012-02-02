package com.taobao.designpattern.mediator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:40:07
 */
public abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}
