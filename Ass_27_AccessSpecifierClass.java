package assignment;

import java.util.Scanner;

public class Ass_27_AccessSpecifierClass {

	public static void main(String[] args) 
	{
		/*Class can have only two type of Access specifier
		 * Public and Default/ Package
		 * Public class- can be accessed anywhere inside the package or outside the package
		 * Default/Package cclass can be accessed within the same package only.
		 * Class can not have protected / private access specifier
		 * Access SPecifier means- Whether you can access it or not? 
		 * We can only access public class methods and variable based on their access specifier only
		 */

			//lets access public class of other package
		int r= 20;
		System.out.println("Area of a circle is : " + Math.PI * r*r); // Math is public class and Pi is its public global variable
		
		// Lets access Scanner class
		Scanner s1=new Scanner(System.in); // Scanner is public class with all non static methods
		System.out.println("Enter Value of a: ");
		int a = s1.nextInt(); 			// nextInt is its one of the public static method, so access it with creating variable.
		System.out.println("Value of a: " + a);
		s1.close();
	}

}
