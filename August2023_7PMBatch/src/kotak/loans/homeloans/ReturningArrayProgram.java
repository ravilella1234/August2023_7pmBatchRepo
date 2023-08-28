package kotak.loans.homeloans;

import java.util.Arrays;

public class ReturningArrayProgram 
{

	public int[] elements()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);
		return new int[] {a,b,c};
	}
	
	public static void main(String[] args) 
	{
		ReturningArrayProgram obj = new ReturningArrayProgram();
		int[] val = obj.elements();
		//System.out.println("A  Valus is : " +  val);
		System.out.println(Arrays.toString(val));
	}

}
