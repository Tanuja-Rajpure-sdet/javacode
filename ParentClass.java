package assignment;

public class ParentClass extends ParentClass2
{
	
	static int loginpin=100;
	
	static void login() // static method
	{
		System.out.println("Login");
	}
	
	void logout() // non static method
	{
		System.out.println("Logout"); 
	}

	public static void main(String[] args) 
	{
/* Parent and child both can have main method, but control need to be in child class
 * Actual logic need to be in child main method
 */

	}

}
