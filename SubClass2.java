package assignment;

public class SubClass2 extends SuperClass1
{
	
	static void searchingProductAddToTheCart()
	{
		System.out.println("Searching and Add to the cart product");
	}

	public static void main(String[] args) 
	{
		Login();
		searchingProductAddToTheCart();
		Logout();
		
	}

}
