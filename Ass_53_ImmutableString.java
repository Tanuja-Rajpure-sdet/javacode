package assignment;

public class Ass_53_ImmutableString {
	/*STrings are immutable in nature
	 * Once string is declared it cannot be changed
	 * 
	 * 
	 */

	public static void main(String[] args) 
	{
		String a= "Playwight";
		
		System.out.println("Original declared string a is :"+ a);
		
		String newa= a.concat(" Automation");
		System.out.println("Original String won't get updated as its immutable: "+ a);
		System.out.println("Original String concatinated with new string is : "+ newa);
		
		
		System.out.println("Substring of new string is: "+(newa.substring(6)));
	}

}
