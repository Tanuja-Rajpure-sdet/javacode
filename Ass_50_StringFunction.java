package assignment;

public class Ass_50_StringFunction {

	public static void main(String[] args) 
	{
		String a="Automation"; 
				//0123456789  Indexing - String follow indexing
		int l1=a.length(); //length give no of characters used to gather any alpha, numeric, spaces present
		System.out.println("Lenght is: "+ l1); // Length starts from 1,2,3,. here length is 10 for Automation
		
		int i1=a.indexOf('n');
		System.out.println("Index of given char is: "+ i1); //It will always give index for first occurrence
		int i2=a.indexOf('o', 5);
		System.out.println("Index of given char from given index is: "+ i2);
		
		char c1=a.charAt(0);
		System.out.println("Char at given index is: "+ c1);
		
		String s1 =a.toLowerCase();
		System.out.println("Lower case is: "+ s1);
		
		String s2=a.toUpperCase();
		System.out.println("Upper case is: "+ s2);
		
		String s3 =a.substring(4);
		System.out.println("substring from given index is: "+ s3);
		
		String s4 =a.substring(4,8); // Whenever we have substring, it will always worked as start index till (end index-1)-Here (4,(8-1)) i.e.(4,7)
		System.out.println("substring from given index is: "+ s4);
		
		String newa=a.concat(" Testing"); // String is immutable, i.e once declared a=Automation, we change not change it
		System.out.println("Concatination of string: "+ newa);
		
		System.out.println("Lenght of new string is: "+ newa.length());
		
		
		
	}

}

