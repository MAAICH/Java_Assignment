package Lab9;

import java.util.Scanner;

// program using Lambda Expression for validating username and password for authentication
interface Validation {

	// boolean method to validate username & password
	boolean validateusername_password(String username, String password);
}

public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Validation upv = (username, password) -> {
			return (username.equals("manoj") && password.equals("manoj123456"));
		};

		System.out.print("Enter the username : ");
		String username = sc.next();

		System.out.print("Enter the password : ");
		String password = sc.next();

		System.out.println("\nAuthentication Status : " + upv.validateusername_password(username, password));
		sc.close();
	}

}
