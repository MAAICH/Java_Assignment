package Lab3;

import java.util.Scanner;

public class StringTokenizer {
	public StringTokenizer(String s, String string) {
		
	}

	public StringTokenizer(String digit) {
		
	}

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers :");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}

	private String nextToken() {
		
		return null;
	}

	private boolean hasMoreTokens() {
		
		return false;
	}
}
