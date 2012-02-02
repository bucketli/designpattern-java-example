package com.taobao.designpattern.iterator;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç03:23:43
 */
public abstract class Iterator<T> {
    public abstract T first();
    public abstract T next();
    public abstract boolean isDone();
    public abstract T currentItem();
}
