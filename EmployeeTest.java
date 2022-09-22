package com.inter.pll;


import com.inter.bll.Employee;
import com.inter.bll.HourlyEmployee;
import com.inter.bll.SalaryEmployee;
public class EmployeeTest {
	
public static void main(String args[]) {
	Employee emp1 = null;

    emp1 = new SalaryEmployee(540, "Raja Saini ", "Developer"); 
    System.out.println(emp1);
    
    System.out.println("Weekly Salary :"+ emp1.calculatePay());
    System.out.println("******************************");
    
    emp1 = new HourlyEmployee(2, 3000, "Raja", " developer"
    		+ " ");
    
    System.out.println(emp1);
    System.out.println("Hourly Salary :"+ emp1.calculatePay());

}
}
