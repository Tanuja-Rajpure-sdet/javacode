package assignment;

import java.util.Scanner;

public class Ass_20_MathClass {
	/*"Write a java program which takes 2 numbers a and b from user at run time and perform below operation:
	Please use methods from Math class
	1.square root of a
	2.maximum
	3.minimum
	4.a*b
	5.a+b
	6.a-b
	7.Absolute value of a"
	*/

	public static void main(String[] args) 
	{/*Lets create Scanner class object and give run time input 
		 * Import math class to perform all operations
		 */
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a:-> ");
		int a=	s1.nextInt();double sqroot = Math.sqrt(a);
		System.out.println("Square root of a is :-> " +sqroot);
		
		System.out.println("Enter the value of b:-> ");
		int b=	s1.nextInt();
		
		System.out.println("Maximum of a and b is :->"+ Math.max(a, b));
		System.out.println("Minimum of a and b is :->"+ Math.min(a, b));
		System.out.println("Multiplication of a and b is :-> "+ Math.multiplyExact(a, b));
		System.out.println("Addition of a and b is :-> "+ Math.addExact(a, b));
		System.out.println("Subtraction of a and b is :-> "+ Math.subtractExact(a, b));
		System.out.println("Absolute Value of a is:-> "+ Math.abs(a));
		s1.close();
			
	}

}
