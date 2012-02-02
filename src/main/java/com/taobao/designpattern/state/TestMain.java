package com.taobao.designpattern.state;
/**
 * @description
 * @author <a href="junyu@taobao.com">junyu</a> 
 * @version 1.0
 * @since 1.6
 * @date 2012-1-31обнГ04:30:54
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account account=new Account("Jim Johnson");
		account.deposit(500);
		account.deposit(300);
		account.deposit(550);
		account.payInterest();
		account.withdraw(2000);
		account.withdraw(1100);
	}

}
