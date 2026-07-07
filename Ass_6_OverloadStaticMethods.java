package assignment;

public class Ass_6_OverloadStaticMethods 
{
	public static void add(int a,int b)
	{
		
		int c=a + b;
		System.out.println("This is addition of integer, sum= "+ c);
	}
	
	public static void add(double a, double b)
	{
		double d=a+b;
		System.out.println("This is addition of double, sum= "+d);	
	}
	
	public static void add(int a, double b, float c)
	{
		double e= a + b +c;
		System.out.println("This is addition of different data types int and double, float; sum= "+e);
	}
	
	public static void main(String[] args) {
		/*WAP to overload static methods
		 * What is Method Overloading:- Its is OOPS concepts, where Developing multiple methods with same name but variation argument list or parameters.
		 * Arguments type i.d data type must be different, not the variable  
		 */
		
		// lets call all static methods
		// Static inside static in same class - By its name
		
		add(3,4);
		add(3.14,17.99999);
		add(109, 1000.55555555555555555555555555555555555, 17.987f);
		
	}
}
