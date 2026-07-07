package assignment;

public class Ass_10_TypesOfVariales {
	/*Local variable- Inside Method, No concept of static or non static, access by name
	 *Global variable- Inside class outside all methods, have static and non static type
	 * Non static global variables called Instance
	 *Access by creating object and access GV with ref variable
	 */
	
	static double pi=3.14; // Static Global variable
	int a = 12345; // Instance

	public static void main(String[] args) 
	{
		int b = 100; // Local variable
		
		//Access local variable by name
		System.out.println("Local variable is:-> "+ b);
		
		//Access global variable (static) by name
		System.out.println("Global variable is:-> "+ pi);
		
		//Access Instance i.e. non static Global variable by creating object
		Ass_10_TypesOfVariales v1=new Ass_10_TypesOfVariales();
		System.out.println("Instance is :-> "+ v1.a);
	

	}

}
