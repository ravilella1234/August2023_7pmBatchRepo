package kotak.loans.homeloans;

import kotak.loans.carloans.A;
import kotak.loans.carloans.B;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 from C");
	}

	public static void main(String[] args) 
	{		
		C c = new C();
		c.m3();
		c.m1();
	}

}
