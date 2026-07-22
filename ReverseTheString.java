package assignment;

public class ReverseTheString {

	public static void main(String[] args) 
	{
		
	String input="Automation";
	String output="";
	//System.out.println("Length of String is: "+ input.length());
	for(int i=input.length()-1; i>=0;i--)
	{
		char c1 = input.charAt(i);
		output=output + c1;
		
	}
	System.out.println("The Reverse string is: "+ output);
	}

}
