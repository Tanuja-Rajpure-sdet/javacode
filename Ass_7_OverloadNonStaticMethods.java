package assignment;

public class Ass_7_OverloadNonStaticMethods {
	
	public void sub(int a, int b)
	{
	 int c=a-b;
	 System.out.println("M1 Subtraction is = "+c);
	}
	
	public void sub(int a, int b, int c)
	{
		int d=((a-b)-c);
		System.out.println("M2 Subtraction is = "+d);
	}
	
	public void sub(float a, int b, double c)
	{
		double f=((b-c)-a);
		System.out.println("M3 Subtraction is = "+f);
	}

	public static void main(String[] args) {
		
		/*Lets call non static method inside static method of same class by creating object with ref variable, 
		 * then call non static method by ref object
		* Syntax    Class name Ref var = New Class name();
		           ref variable .non static method();
		*/
		Ass_7_OverloadNonStaticMethods subtraction=new Ass_7_OverloadNonStaticMethods();
		subtraction.sub(3,0,18777777);
		
		subtraction.sub(0.13f,8000,1223.987878);
		
		subtraction.sub(199, 2,0);
		
	}

}
