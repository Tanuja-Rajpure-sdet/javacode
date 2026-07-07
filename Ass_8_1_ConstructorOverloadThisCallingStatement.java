package assignment;

public class Ass_8_1_ConstructorOverloadThisCallingStatement 
/*This calling statement used for constructor overloading
 * Definition- Calling one constructor from another constructor within same class.
 * This () should be first line of each constructor
 * This() should written explicitly only
 * Here we don't need to create object for each constructor to call
 * First constructor will call whose arguments passed in object in main method
 */
{
	public Ass_8_1_ConstructorOverloadThisCallingStatement(int a)
	{
		this (1000, "Automation");
		System.out.println("1St Constructor");
	}
	
	public Ass_8_1_ConstructorOverloadThisCallingStatement(int a, String b)
	{
		this("TANUJA");
		System.out.println("2nd Constructor");
	}
	
	public Ass_8_1_ConstructorOverloadThisCallingStatement(String a)
	{
		this(1000, "AUTOMATION", 'G');
		System.out.println("3rd Constructor");
	}
	
	public Ass_8_1_ConstructorOverloadThisCallingStatement(int a, String b, char c)
	{
		System.out.println("4th Constructor");
	}
	
	public static void main(String[] args) 
	{
		//Lets call This()
		new Ass_8_1_ConstructorOverloadThisCallingStatement(10000);

	}

}
