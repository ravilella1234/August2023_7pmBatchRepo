package kotak.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add(20);
		a.add("ravikanth");
		a.add(12.34f);
		a.add(10);
		
		System.out.println(a);
		System.out.println(a.indexOf("ravikanth"));
		System.out.println(a.size());
		System.out.println(a.get(2));
		System.out.println(a.contains("ravikanth"));
		System.out.println(a.isEmpty());
		a.add(30);
		System.out.println(a);
		a.add(3, "sai");
		System.out.println(a);
		a.set(3, "sairam");
		System.out.println(a);
		System.out.println(a.subList(2, 6));
		a.remove(2);
		System.out.println(a);
		a.remove("sairam");
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
