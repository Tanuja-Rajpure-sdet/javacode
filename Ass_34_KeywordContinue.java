package assignment;

public class Ass_34_KeywordContinue {

	public static void main(String[] args) {
		// Continue keyword used to skip the iteration
		
		for(int a=10; a<=18; a++)
		{
			if(a==12 || a==16)
			{
				continue;
			}
			
			System.out.println("Your age is: "+ a);
		}

	}

}
