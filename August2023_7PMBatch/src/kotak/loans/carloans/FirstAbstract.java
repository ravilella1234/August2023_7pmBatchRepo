package kotak.loans.carloans;

public abstract class FirstAbstract 
{
	int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 from FirstAbstract Class");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstract obj = new FirstAbstract();
		
		FirstAbstract obj = new ChildClass();
		obj.m1();
		obj.m2();
	}
}
