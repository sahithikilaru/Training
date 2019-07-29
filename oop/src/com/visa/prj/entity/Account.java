package com.visa.prj.entity;
/**
 * This is a class to represent account business data.
 * It allows to credit and debit amount.
 * 
 * @author root
 * @version 1.0
 */

public class Account {
	private double balance; // state of object --> instance variable
	
	private static int count;
	
	public Account() {
		count++;
	}
	
	/**
	 * Method to credit amount into account.
	 * 
	 * @param amt amount to be credited.
	 */
	public void deposit(double amt) { // public void deposit(Account this, double amt)
		balance += amt;               // this.balance += amt;
	}
	
	/**
	 * Method return the current balance in account.
	 * @return the current balance.
	 */
	
	public double getBalance() {
		return this.balance;
	}
	
	public static int getCount() {
		
		return count;	
		
	}

}
