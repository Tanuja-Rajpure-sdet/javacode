package assignment;

public class Ass_11_UpdateValueofLocalandGlobalVariables {

	static double area=13.6; // Static Global variable
	int a = 65; // Instance variable

	public static void main(String[] args) 
	{
		int b = 100; // Local variable
		//how to update local variable value, by directly updating it
		b=90;
		System.out.println("Updated Local variable is:-> "+ b);
		
		//Update static global variable value by update directly and access
		area = 110;
		System.out.println("Updated Global variable is:-> "+ area);
		
		//Update value of Instance i.e. non static Global variable by 
		Ass_11_UpdateValueofLocalandGlobalVariables v1=new Ass_11_UpdateValueofLocalandGlobalVariables();
		v1.a=70;
		System.out.println("Updated Instance is :-> "+ v1.a);
	
		/*We can also print and update in one line
		 * System.out.println("Updated Instance is :-> "+ (v1.a=70));
		 */

		}

}
