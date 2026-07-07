package assignment;

public class Ass_9_OverloadStaticAndNonStaticMethods {
	
	public static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("The sum of integers is = "+ sum );
	}
	
	public void add(double a, double b)
	{
		double sum = a+b;
		System.out.println("The sum double is = "+ sum );
	}
	
	public static void add(double a, float b)
	{
		double sum = a+b;
		System.out.println("The sum double and float is = "+ sum );
	}
		
	public void add(double a, int b, float c)
	{
		double sum = a+b+c;
		System.out.println("The sum of all is = "+ sum );
	}

	public static void main(String[] args) 
	{
		//Call static methods by name
		add(4,98);
		add(776.111111111, 0.19f);
		//call non static variable by creating object
		Ass_9_OverloadStaticAndNonStaticMethods sum1 = new Ass_9_OverloadStaticAndNonStaticMethods();
		sum1.add(15678.9999999999999999999, 9999999, 878.34f);
		
		sum1.add(16.8766,0.9997);
	}

}
