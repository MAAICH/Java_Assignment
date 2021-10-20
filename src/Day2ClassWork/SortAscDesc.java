package Day2ClassWork;

public class SortAscDesc {

	public static void main(String[] args) {
		int[] a = { 4, 7, 2, 8, 10, 5, 1, 6 };

		assendingSort(a);

		descendingSort(a);

	}

	static void assendingSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	static void descendingSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Descending Order");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
