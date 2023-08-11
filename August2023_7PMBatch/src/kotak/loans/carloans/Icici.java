package kotak.loans.carloans;

public class Icici implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("Iam overriden withdrarl in Icici ");
	}

	@Override
	public void deposit() {
		System.out.println("Iam overriden deposit in Icici ");
	}
	
	public static void main(String[] args) {
		Icici i = new Icici();
		i.deposit();
		i.withdrawl();
	}

}
