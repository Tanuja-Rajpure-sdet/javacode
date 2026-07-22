package assignment;

import java.util.Scanner;

public class Ass_35_Keywordassert {
	/*assert keyword in java
	 * assertion means when expected is equal to actual result
	 * Type1-Hard assertion, if Exp and actual are not equal then program will stop and Assertion Error will be given
	 * Type2-Soft Assertion, if Exp and actual are not equal then program will continue till end and Assertion Error will be given
	 * assert is hard assertion
	 * SYNTAX1-assert condition;
	 * SYNTAX2- assert condition:"Message" // Message will be displayed only if assertion fail
	 * For every program assertion need to be enable from run config-ARguments-VM args-type '-ea'(means enable arguments)
	 */

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Is server Up: true /false ? ");
		boolean isserverup=s1.nextBoolean();
		assert (isserverup==true): "Nope Server is DOWN now, Please try after sometime.";
		{
			System.out.println("Server is UP Now, ready to work.");
		}
		
		s1.close();

	}

}
