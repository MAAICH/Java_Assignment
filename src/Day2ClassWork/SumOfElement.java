package Day2ClassWork;

public class SumOfElement {
	static int arr[] = {12,14,16,17};
	static int sum()
	{
		int sum=0;
		int i;
		for (i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
		public static void main(String[] args) {
		System.out.println("Sum of given array is " + sum());

		}

	}


