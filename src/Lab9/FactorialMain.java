package Lab9;
import java.util.Scanner;

interface Factorial {

	int factorial(int number);
}

public class FactorialMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Factorial fact = (number) -> {
			int product = 1;
			for (int i = 0; i <= number; i++) {
				if (i == 0)
					product = 1;
				else
					product = product * i;
			}
			return product;
		};
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.printf("\nThe factorial of %d is %d.\n", number, fact.factorial(number));

		sc.close();
	}

}