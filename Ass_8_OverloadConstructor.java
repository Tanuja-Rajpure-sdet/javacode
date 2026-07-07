package assignment;

public class Ass_8_OverloadConstructor 
{	
	// Developing multiple constructors but variation in arguments or parameters.
	public Ass_8_OverloadConstructor(int a)
	{
		System.out.println("1St Constructor");
	}
	
	public Ass_8_OverloadConstructor(int a, String b)
	{
		System.out.println("2nd Constructor");
	}
	
	public Ass_8_OverloadConstructor(String a)
	{
		System.out.println("3rd Constructor");
	}
	
	public Ass_8_OverloadConstructor(int a, String b, char c)
	{
		System.out.println("4th Constructor");
	}
	
	public static void main(String[] args) 
	{
		//Lets create object to call each constructor
		new Ass_8_OverloadConstructor(5); // Its other way of creating object in Constructor 
		new Ass_8_OverloadConstructor(5, "jfejoug");
		new Ass_8_OverloadConstructor("OK");
		new Ass_8_OverloadConstructor(5, "Tanuja", 'X');

	}

}
