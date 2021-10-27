package Lab4;

public class CurrentAccount extends Account {
private double overdraftLimit;
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}

	public CurrentAccount(double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}

	//Overriding withdraw method
	public void withdraw(double sum) {
		if(sum>overdraftLimit)
			System.out.println("You cannot withdraw more than overdraft limit INR "+overdraftLimit);
		else
			super.withdraw(sum);
	}

}

