package assignment;

import java.util.Scanner;

public class Ass_22_ScannerCircleAreaAndCircumference {

	public static void main(String[] args) 
	{// "WAP to calculate  area & circumference using scanner class for Circle"
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radious of a circle: ");
		double r= s1.nextDouble();
		System.out.println("Area of a circle is:-> "+ (Math.PI *r*r));
		System.out.println("Circumference of circle is :-> "+ (2* Math.PI * r));
		s1.close();

	}

}
