package Lab4;
import java.util.Random;
public class AccountMain {

	//Method to generate automatic account number
	public static long generateAccountNumber() {
		Random r=new Random();
		return Math.abs(r.nextLong());
	}

	public static void main(String[] args) {
		//Random r=new Random();
		
		//Creating account for Smith
		Person p1=new Person("Smith",25);
		long accNum1 = generateAccountNumber();
		Account a1=new Account(accNum1,2000,p1);
		
		//Creating account for Kathy
		Person p2=new Person("Kathy",24);
		long accNum2 = generateAccountNumber();
		Account a2=new Account(accNum2,3000,p2);
		
		//Depositing INR 2000 to Smith's account
		a1.deposit(2000);
		
		//Withdrawing INR 2000 from Kathy's account
		a2.withdraw(2000);
		
		//Displaying updated balances in both the accounts
		System.out.println("Smith's balance = INR "+a1.getBalance());
		System.out.println("Kathy's balance = INR "+a2.getBalance());
	}

}
