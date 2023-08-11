package kotak.loans.carloans;

public class SecondClass 
{
	// data properties - data
	int a=10,b=20,c;
	
	// behaviours(method)  - operations
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " + c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & B is : " + c);
	}
	
	public static void main(String[] args) 
	{		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
	}
}
