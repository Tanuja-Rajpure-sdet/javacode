package assignment;

public class Ass_9_1_OverloadStaticNonStaticAndConstuctor 
{
	public static void add(int a, int b) // static method
	{
		int sum = a+b;
		System.out.println("This is static method and sum is = "+ sum );
	}
	
	public void add(double a, double b) // non static method
	{
		double sum = a+b;
		System.out.println("This is non-static method and sum is = "+ sum );
	}
	
	Ass_9_1_OverloadStaticNonStaticAndConstuctor(float a, double b) //default Constructor (Constructor won't have return type and modifier is always non static) 
	{
		double sum = a+b;
		System.out.println("This is constructor and sum is = "+ sum);
	}
	
	public static void main(String[] args)
	{
		//Let's call all methods static, non static, constructor
		add(1999999,1); // called static method
		
		/* Lets call non static methods by creating object, which also call constructor,
		 * then call non static method with ref of object*/
Ass_9_1_OverloadStaticNonStaticAndConstuctor sum =new Ass_9_1_OverloadStaticNonStaticAndConstuctor(1223.11f, 178.9999); // Object creation also add arguments for constructor as it is also calling constructor
		
		sum.add(123.443, 19.809999);  // Calling no static method with reference variable
		
	}

}
