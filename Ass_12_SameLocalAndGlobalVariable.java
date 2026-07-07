package assignment;

public class Ass_12_SameLocalAndGlobalVariable {
	
	static int a =10; //Global Variable
	//int a=10;

	public static void main(String[] args) 
	{
		final int a = 10; // Local Variable
		
		
		//If LV and GV are same, then preference will be given to LV first
		System.out.println("If GV and LV are same, preference will be given to LV, hence local variable is -> "+ a);
		
		Ass_12_SameLocalAndGlobalVariable.a =19;
		
		//Still if we want to access GV, we have to access by class name.GV
		System.out.println("GV Variable is:-> "+Ass_12_SameLocalAndGlobalVariable.a);
		
		//Let's access instance i.enon static GV by creating an object.
		
		/*Ass_12_SameLocalAndGlobalVariable v1=new Ass_12_SameLocalAndGlobalVariable ();
		Sy*stem.out.println("Instance is -> "+ v1.a);
		*/
	}

}
