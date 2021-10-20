package Day2ClassWork;

public class MinArray {
	public static void main(String[] args) {
		int[] a = { 6, 5, 3, 8, 9, 3 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("minimum element is " + min);

	}
}
