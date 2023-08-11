package kotak.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x = 100; // primitive Instance variable
	static String cname = "vmware" ; // primitive static variable
	static VariableTypes obj;
	
	public int m1()
	{
		int y = 300;
		int x = 200; // primitive local variable
		System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
		return y;
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

	public static void main(String[] args) 
	{	
		 obj = new VariableTypes(); // non-primitive (or) reference Variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		int var = obj.m1();
		System.out.println("Var : " + var);
		m2();
	}

}
