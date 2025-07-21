package com.abitha.assignment3;

public abstract  class Account {
	protected String accountHolder;
	 protected double balance;

	 public Account(String accountHolder, double initialBalance) {
	     this.accountHolder = accountHolder;
	     this.balance = initialBalance;
	 }

	 public abstract void deposit(double amount);
	 public abstract void withdraw(double amount);
	 public abstract double getBalance();


}
