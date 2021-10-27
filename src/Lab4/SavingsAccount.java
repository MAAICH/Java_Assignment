package Lab4;

public class SavingsAccount extends Account {

	private static final double minBal=500;
	
	//Generating constructors from superclass
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}

	//Overriding withdraw method
	public void withdraw(double sum) {
		if(getBalance()-sum<minBal)
			System.out.println("You cannot withdraw. Minimum balance of INR "+minBal+" needs to be maintained");
		else 
			super.withdraw(sum);
	}
	
}
