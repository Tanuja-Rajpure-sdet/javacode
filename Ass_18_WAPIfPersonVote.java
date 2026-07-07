package assignment;

public class Ass_18_WAPIfPersonVote {

	public static void main(String[] args) 
	{
		/*" WAP to check person can vote only if he/she is 18 or above
		 * and should not vote if age is less."
		 */
		int age = 18;
		String VoteCard= "N";
				
				if((age>=18) && (VoteCard=="Y"))
				{
					System.out.println("You are eligible for Vote");
				}
				else if((age>=18) && (VoteCard=="N"))
				{
					System.out.println("You are NOT eligible for Vote");
				}
				else
				{
					
				}
				
	}

}
