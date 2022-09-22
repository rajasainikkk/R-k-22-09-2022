package com.inter.pll;
import com.inter.bll.BankAccount;
import com.inter.bll.BusinessAcc;
import com.inter.bll.CurrentAccount;
import com.inter.bll.SalaryAcc;
public class BankAccTest {
	



		public static void main(String[] args) {

			BankAccount acc1 = null;

			System.out.println("\n++++++++++++Salary Account++++++++++++++++++++");
			acc1 = new SalaryAcc(8000);

			System.out.println("Balance: " + acc1.getBalance());

			acc1.deposit(4000);

			System.out.println("After deposit balance: " + acc1.getBalance());

			if (acc1.withdraw(5000)) {
				System.out.println("Withdrawal successfully.");
			} else {
				System.out.println("Insufficient balance.");
			}

			System.out.println("After withdrawal balance: " + acc1.getBalance());

			System.out.println("\n**************Current Account**************");

			acc1 = new CurrentAccount(15000);

			System.out.println("Balance: " + acc1.getBalance());

			acc1.deposit(4000);

			System.out.println("After deposit the balance: " + acc1.getBalance());

			if (acc1.withdraw(15000)) {
				System.out.println("Withdrawal successfully.");
			} else {
				System.out.println("Insufficient balance.");
			}

			System.out.println("After withdrawing balance: " + acc1.getBalance());

			System.out.println("\n**************Business Account**************");

			acc1 = new BusinessAcc(80000);

			System.out.println("Balance: " + acc1.getBalance());

			acc1.deposit(4000);

			System.out.println("After deposi balance: " + acc1.getBalance());

			if (acc1.withdraw(110000)) {
				System.out.println("Withdrawal successfully.");
			} else {
				System.out.println("Insufficient balance.");
			}

			System.out.println("After withdrawal balance: " + acc1.getBalance());
		}

	


}
