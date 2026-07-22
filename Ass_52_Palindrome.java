package assignment;

public class Ass_52_Palindrome {

	public static void main(String[] args) 
	{
		String input = "civic";
		String Output="";
		
		
	
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			Output= Output+ c1;
		}
		
		System.out.println("Your input is: "+ input);
		System.out.println("Your output is: "+ Output);
		
		if(input.equals(Output))
		{
			System.out.println("This is Palindrome");
		}
		else
		{
			System.out.println("This is NOT Palindrome");
		}
		
	}

	

}
