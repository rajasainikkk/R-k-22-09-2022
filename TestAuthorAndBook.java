package com.inter.pll;
import com.inter.bll.*;
import com.inter.bll.Book;
public class TestAuthorAndBook {
	public static void main(String args[]) {
		Author A1 = new  Author();
		Author A2 = new Author ("Raja ", "rajasaini3757@gmail.com");
		
		System.out.println(A2);;
		System.out.println("Name " +A2.getName());
		System.out.println("Email "+A2.getEmail());
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		

		Book B = new Book(" ISBN101 ","aman  ", A2 ,200.0 , 2 );
		System.out.println(B);
		B.setPrice(100);
		B.setQty(10);
		System.out.println("ISBN  "+ B.getISBN());
		System.out.println("Name  " +B.getName());
		System.out.println("Price "+ B.getPrice());
		System.out.println(" Qty "+ B.getQty());
		
		System.out.println("||||||||||||||||||||||||||||||||||||||||");
		
		
		
	}

}
