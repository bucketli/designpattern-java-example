package com.taobao.designpattern.state;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç04:14:37
 */
public class RedState extends State {
	double serviceFee;

	public RedState(State state) {
		this.balance = state.getBalance();
		this.account = state.getAccount();
		init();
	}

	private void init() {
		interest = 0.0;
		lowerLimit = -100.0;
		upperLimit = 0.0;
		serviceFee = 15.00;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		stateChangeCheck();
	}

	@Override
	public void withdraw(double amount) {
		amount = amount - serviceFee;
		System.out.println("No funds available for withdrawal!");
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub

	}

	private void stateChangeCheck() {
		if (balance > upperLimit) {
			account.setState(new SilverState(this));
		}
	}

}
