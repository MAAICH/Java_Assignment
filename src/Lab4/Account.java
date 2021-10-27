package Lab4;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	//Constructors
	public Account() {
		balance=500;
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	//Getters and Setters

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double sum) {
		System.out.println(sum+" amount deposited");
		balance+=sum;
	}
	
	public void withdraw(double sum) {
		System.out.println(sum+" amount withdrawn");
		balance-=sum;
	}
}
	
