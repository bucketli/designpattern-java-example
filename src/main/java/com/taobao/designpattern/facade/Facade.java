package com.taobao.designpattern.facade;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç02:41:46
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;
    public Facade(){
    	one=new SubSystemOne();
    	two=new SubSystemTwo();
    	three=new SubSystemThree();
    	four=new SubSystemFour();
    }
    
    public void methodA(){
    	System.out.println("methodA()----");
    	one.methodOne();
    	two.methodTwo();
    	four.methodFour();
    }
    
    public void methodB(){
    	System.out.println("methodB()----");
    	two.methodTwo();
    	three.methodThree();
    }
}
