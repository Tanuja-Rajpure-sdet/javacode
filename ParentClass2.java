package assignment;

import java.util.Scanner;

public class ParentClass2 {

	final static int Pin=1334;
	
	void addToCard()
	{
		System.out.println("Add products to Cart");
	}
	public static void payment()
	{
		System.out.println("Enter the OTP for payment: ");
		Scanner s1=new Scanner(System.in);
		s1.nextInt();
		
		System.out.println("Payment done");
		s1.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
