package assignment;

import java.util.Scanner;

public class Ass_23_ScannerTriangleAreaAndPerimeter {
	/*"WAP to calculate  area & perimeter using scanner class for triangle"
	 * 1St calculate semi-perimeter s=((a+b+c)/2)
	 * Area is square root of (s(s-a)(s-b)(s-c))
	 */

	public static void main(String[] args) 
	{ Scanner s1=new Scanner(System.in);
		System.out.println("Enter sides of Triangle a: ");
		double a=s1.nextDouble();
		System.out.println("Enter sides of Triangle b: ");
		double b=s1.nextDouble();
		System.out.println("Enter sides of Triangle c: ");
		double c=s1.nextDouble();
		double p=a+b+c;
		double s=0.5*p;
		double y=(s*(s-a)*(s-b)*(s-c));
		System.out.println("Semi-perimeter of a triangle is: "+s);
		
		System.out.println("Area of a triangle is :->"+ Math.sqrt(y));
		
		System.out.println("Perimeter of a circle is:-> " + p);

		s1.close();
	}

}
