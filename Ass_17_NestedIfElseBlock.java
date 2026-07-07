package assignment;

public class Ass_17_NestedIfElseBlock {

	public static void main(String[] args) 
	{
		/*Nested means- One inside another
		 * Any conditional statement can be inside any other conditional statemnet
		 */
		String Day="Saturday";
		int Date= 30;
		
		if(Date<=15)
		{
			if(Day!="Monday")
			{
				System.out.println("School will remain closed");
			}
			else if(Day=="Monday")
			{
				System.out.println("First day of school");
			
			}
			
		}
		else
		{
			if(Day=="Sunday")
			{
				System.err.println("School remain close on SUnday");
			}
			else
			{
				System.err.println("Please contact admin team");
			}
		}
	}

}
					