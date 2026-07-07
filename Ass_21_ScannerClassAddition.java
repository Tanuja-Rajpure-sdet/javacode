package assignment;

import java.util.Scanner;

public class Ass_21_ScannerClassAddition {

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in); 
		/* Lets call scanner class by creating an object  where we need to mention class name SCanner as it is present in SCanner class
		 * Whenever we create an object of other class, default constructor of that class will be called, 
		 * but scanner class don't have non parameterized constructor
		 * In java we cannot create object of any class without any parameters, it will give compile time error
		 * SO lets pass parameters, System.in- accespts human input at run time
		 */
		//Lets access methods of SCanner class with help of ref variable 's1'
		System.out.println("Enter value of a: ");
		int a=	s1.nextInt();
		System.out.println("The value of a is:-> "+a);
			
		System.out.println("Enter value of b: ");
		int b=	s1.nextInt();
		System.out.println("The value of b is:-> "+b);
		
		int sum= a+b;
		
		System.out.println("The Sum of a and b is :--> "+ sum);
		s1.close();
	

	}

}
