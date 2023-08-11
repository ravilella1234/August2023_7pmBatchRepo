package kotak.loans.carloans;

public class Hdfc implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("Iam overriden withdrarl in HDFC ");
	}

	@Override
	public void deposit() {
		System.out.println("Iam overriden deposit in HDFC ");
	}
	
	public static void main(String[] args) 
	{
		Hdfc h = new Hdfc();
		h.deposit();
		h.withdrawl();
	}

}
