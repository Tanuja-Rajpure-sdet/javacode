package assignment;

public class Ass_16_IfElseIf {

	public static void main(String[] args) {
		/* If Else If Block- Here 'If' and 'Else If' have condition, but Else won't have condition
		*"Note: IN the case of if else if block which ever condition will become true for the 1st time that block will only execute"					
		*/
		int a=10;
		int b=20;
		int c=30;
		if (a==c)
		{
			System.out.println("Statement 1");
		}
		else if(c==b)
		{
			System.out.println("Statement 2");
		}
		else
		{
			System.out.println("Statement 3");	
		}
	}

}
