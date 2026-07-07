package assignment;

import java.util.Scanner;

public class Ass_25_ScannerSquareAreaAndPerimeter {

	//"WAP to calculate  area & Perimeter using scanner class for square"
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the side of the square:");
		int s=s1.nextInt();
		
		System.out.println("Area of the square is:-> "+ (s*s));
		System.out.println("Perimeter of the square is:-> "+ (4*s));
		s1.close();
	}

}
