package Lab9;

import java.util.Scanner;

//program using Lambda Expression for inserting space between each character of a String

interface StringFormat {

	String returnExpression(String string);
}

public class StringSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringFormat se = (string) -> {
			char characters[] = string.toCharArray();
			String result = "";
			for (int i = 0; i < characters.length - 1; i++) {
				result += characters[i] + " ";
			}
			return result + characters[characters.length - 1];
		};
		System.out.print("Enter the string : ");
		String string = sc.next();
		System.out.println("\nResultant string = " + se.returnExpression(string));

		sc.close();

	}

}
