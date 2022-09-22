package com.inter.bll;

public interface  BankAccount {
	
		public double getBalance();
		public void deposit(double amount);
		boolean  withdraw(double amount);
	}


