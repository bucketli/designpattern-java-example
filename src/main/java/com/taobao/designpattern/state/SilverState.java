package com.taobao.designpattern.state;

/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a>
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31ÏÂÎç04:18:01
 */
public class SilverState extends State {

	public SilverState(State state) {
		this.setBalance(state.getBalance());
		this.setAccount(state.getAccount());
	}

	public SilverState(double balance, Account account) {
		this.setBalance(balance);
		this.setAccount(account);
		init();
	}

	private void init() {
		interest = 0.0;
		lowerLimit = 0.0;
		upperLimit = 1000.0;
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
		if (balance < lowerLimit) {
			account.setState(new RedState(this));
		} else if (balance > upperLimit) {
			account.setState(new GoldState(this));
		}
	}

}
