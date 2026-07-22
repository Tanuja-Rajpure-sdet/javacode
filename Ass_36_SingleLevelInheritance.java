package assignment;

public class Ass_36_SingleLevelInheritance extends Ass_6_OverloadStaticMethods
	{
	/*In this inheritance the single sub class inherits the properties of single super class
	 * Properties means methods (only static and non static) and Global variables
	 * extends keyword is used for making relationship
	 * sub class/child class extends super class/parent class
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		int a=1001;
		double b=0.00120889;
		float c=1.234f;
		int x=1300;
		double y=0.123;
		
		Ass_6_OverloadStaticMethods.add(a, b, c);
		add(a,b,c);  // we can directly call by method name
		Ass_6_OverloadStaticMethods.add(b, y);
		Ass_6_OverloadStaticMethods.add(a, x);
		
	}
}
