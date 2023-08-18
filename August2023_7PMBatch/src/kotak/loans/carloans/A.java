package kotak.loans.carloans;

import java.util.Date;

public  class A 
{
	 public static final int x = 100;
	
	public void m1()
	{
		x=200;
		System.out.println("iam m1 from A");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static method in A");
	}
	
	static
	{
		System.out.println("iam static block..");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		m5();
	}
}
