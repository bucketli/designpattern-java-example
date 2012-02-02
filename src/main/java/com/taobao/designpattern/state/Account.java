package com.taobao.designpattern.state;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç04:07:53
 */
public class Account {
	private State state;
	private String owner;
	
	public Account(String owner){
		this.owner=owner;
		state=new SilverState(0.0,this);
	}
	
	public double getBalance(){
		return state.getBalance();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void deposit(double amount){
		state.deposit(amount);
		System.out.println("Deposited "+amount);
		System.out.println("--Balance= "+this.getBalance());
		System.out.println("--State= "+this.state.getClass().getSimpleName());
		System.out.println("");
	}
	
	public void withdraw(double amount){
		state.withdraw(amount);
		System.out.println("Withdraw "+amount);
		System.out.println("--Balance= "+this.getBalance());
		System.out.println("--State= "+this.state.getClass().getSimpleName());
		System.out.println("");
	}

	public void payInterest(){
		state.payInterest();
		System.out.println("Interest Paid ");
		System.out.println("--Balance= "+this.getBalance());
		System.out.println("--State= "+this.state.getClass().getSimpleName());
		System.out.println("");
	}
}
