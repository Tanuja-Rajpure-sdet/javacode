package assignment;

import java.util.Scanner;

public class Ass_33_LogicalOperators {

	public static void main(String[] args) 
	{
	 /*AND Operator- For ANd Both conditions need to be True
	  * OR- Operator- For OR either condition need to be true
	  * NOT Operator- It will reverse the output
	  */
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age=s1.nextInt();
		System.out.println("Your age is : " + age);
		System.out.println("Do you have Voting Card- true/false? ");
		boolean isvotecard=s1.nextBoolean();
		
			if(age >=18 && isvotecard ) //AND Operator - "&&"
			{
				System.out.println("You are allowed to Vote");	
			}
			if(age>18 || isvotecard) // OR Operator- "||"
			{
				if(!(isvotecard==true))  // NOT operator - "!"
				System.out.println("Please get your Vote card first");
			}
			else
			{
				System.out.println("You are not allowed to Vote");
			}
			s1.close();
		
	}

}
