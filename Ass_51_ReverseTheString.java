package assignment;

public class Ass_51_ReverseTheString {
	{
		
	String input="Automation";
	String output="";
	//System.out.println("Length of String is: "+ input.length());
	for(int i=input.length()-1; i>=0;i--)
	{
		char c1 = input.charAt(i);
		output=output + c1;
		
	}
	System.out.println("The Reverse of input string is: "+ output);
	
	}

}
