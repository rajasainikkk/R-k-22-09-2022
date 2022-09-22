package com.inter.bll;


public class HourlyEmployee  extends Employee {

	private int hourworked;
	private int payrate;
	
	public HourlyEmployee()
	{
		super();
	}
	public  HourlyEmployee( int hourworked , int payrate, String name, String jobtitle )
	{
		super(name ,jobtitle);
		this.hourworked=hourworked;
		this.payrate=payrate;
	}
	public int getHourworked()
	{
		return hourworked;
	}
	public int getPayrate()
	{
		return payrate;
	}
	public void setHourworked(int hourworked )
	{
		this.hourworked=hourworked;
	}
	public void setPayrate(int payrate)
	{
		this.payrate=payrate;
	}
	public double calculatePay() {
		return hourworked*payrate;
	}
}
