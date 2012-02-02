package com.taobao.designpattern.command;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ03:13:15
 */
public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver){
    	this.receiver=receiver;
    }
    
    public abstract void execute();
}
