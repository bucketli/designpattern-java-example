package com.taobao.designpattern.state;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç04:21:21
 */
public class GoldState extends State {
	public GoldState(State state) {
		this.setBalance(state.getBalance());
		this.setAccount(state.getAccount());
	}

	public GoldState(double balance, Account account) {
		this.setBalance(balance);
		this.setAccount(account);
		init();
	}

	private void init() {
		interest = 0.05;
		lowerLimit = 1000.0;
		upperLimit = 10000000.0;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		stateChangeCheck();

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		stateChangeCheck();

	}

	@Override
	public void payInterest() {
		balance += interest * balance;
		stateChangeCheck();

	}

	private void stateChangeCheck() {
		if (balance < 0.0) {
			account.setState(new RedState(this));
		} else if (balance < lowerLimit) {
			account.setState(new SilverState(this));
		}
	}

}
