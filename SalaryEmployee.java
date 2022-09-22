package com.inter.bll;

public class SalaryEmployee  extends Employee{
	 
	public double weeklysalary;
	
	public SalaryEmployee() {
		super();
	}
	public SalaryEmployee(double weeklysalary , String name , String jobtitle ) {
		super(name, jobtitle);
		this.weeklysalary=weeklysalary;
	}
	public double getWeeklySalary() {
		return weeklysalary;
	}
	public void setWeeklySalary(double weeklysalary) {
		this.weeklysalary = weeklysalary;
	}

	public double calculatePay() {
		return weeklysalary;
	}

}
