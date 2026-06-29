package assignment;

public class Ass_3_CallStaticMethodInsideMainMethod {

	static void add()
	{
		System.out.println("This is Static Method");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		add(); // static method called by its name inside main method
	}

}
