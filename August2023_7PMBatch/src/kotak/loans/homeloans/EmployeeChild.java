package kotak.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(100,"ravi",12.34f);
		this.city = city;
		System.out.println(this.city);
	}
	
	public void m1()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");

	}

}
