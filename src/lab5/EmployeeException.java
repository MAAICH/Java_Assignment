package lab5;
import java.util.Scanner;
class SalaryException extends Exception{
	public SalaryException(String str) {
		System.out.println(str);
	}
}
public class EmployeeException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int salary=sc.nextInt();
		try {
			if(salary<3000)
				throw new SalaryException("Invalid Employee Salary");
			else
				System.out.println("Valid Employee Salary");
		}
		catch(SalaryException s) {
			System.out.println(s);
	}

	}

}
