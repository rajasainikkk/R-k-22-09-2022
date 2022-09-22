package com.inter.bll;

public class BusinessAcc implements BankAccount {
 private double balance;
 
 public BusinessAcc() {
	 
 }
 public BusinessAcc( double balance) {
	 this.balance = balance;
	 
 }
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
       balance +=amount;		
	}

	@Override
	public boolean withdraw(double amount) {
		if ((balance +25000)>= amount ) {
			balance -= amount;
			return true;
		}
		return false;
	}
	

}
