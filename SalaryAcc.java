package com.inter.bll;

public class SalaryAcc  implements BankAccount{
	private double  balance;
	
	public SalaryAcc() {
		
	}
    public SalaryAcc(double balance) {
    	
    }
    @Override 
    public double getBalance( ) {
    	return balance;
    }
    @Override
    public void deposit(double amount) {
    	this.balance +=amount;
    }
    @Override
    public boolean withdraw(double amount) {
    	if(balance>=amount) {
    		balance-=amount;
    		return true;
    	}
    	return false;
    }
}
