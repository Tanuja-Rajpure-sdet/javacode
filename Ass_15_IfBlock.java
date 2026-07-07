package assignment;

public class Ass_15_IfBlock {

	public static void main(String[] args) 
	{
		// If Block - Whichever condition is/are TRUE only execute among given conditions.
		
		int a=100;
		int b=200;
		System.out.println("START");
		if (a>=60) //true
		{
			System.out.println("Conditional statement 1");
		}
		
		if (a<=60) //false
		{
			System.out.println("Conditional statement 2");
		}
		if (a==b) //false
		{
			System.out.println("Conditional statement 3");
		}
		if (a!=60) // true
		{
			System.out.println("Conditional statement 4");
		}
		System.out.println("END");
	}

}
