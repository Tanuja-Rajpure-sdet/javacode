package assignment;

import java.util.Scanner;
// "WAP to calculate  area& circumference using scanner class for rectangle"
public class Ass_24_ScannerRectangleAreaAndPerimeter {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the length of the reclangle:");
		int l=s1.nextInt();
		
		System.out.println("Enter the width of the reclangle:");
		int w=s1.nextInt();
		
		System.out.println("Area of the Rectangle is:-> "+ Math.multiplyExact(l, w));
		System.out.println("Perimeter of the Rectangle is:-> "+ 2*(Math.addExact(l, w)));
		
		s1.close();
	}

}
