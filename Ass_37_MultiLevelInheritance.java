package assignment;

public class Ass_37_MultiLevelInheritance extends ParentClass
{
	/*MLI means Single parent class will be inherited by single sub class and
	 * again that class will be inherited by another sub class and so on
	 * 
	 */
	public static void main(String[] args) 
	{
		System.out.println("Accessing static Global Variable: "+ loginpin); // Access GV from Parent class
		login(); // Accessing static method from parent class by name
		
		Ass_37_MultiLevelInheritance c1=new Ass_37_MultiLevelInheritance(); // Lets create object to access super parent class2 non static method
		c1.addToCard();
		
		payment(); // access static method by name
		//ParentClass2.payment();
		
		Ass_37_MultiLevelInheritance p1=new Ass_37_MultiLevelInheritance(); // Lets create object to access parent class non static method
		p1.logout();
		
	}

}
