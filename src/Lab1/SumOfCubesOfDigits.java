package Lab1;
import java.util.Scanner;
public class SumOfCubesOfDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int Sum= CubeSumofAllDigits(n);
		System.out.println("Sum is: "+Sum);
	}
	private static int CubeSumofAllDigits(int n) {
		int newSum=0;
		do {
			int rem=n%10;
			newSum=newSum+(rem*rem*rem);
			n=n/10;
		}
		while(n!=0); 
			return newSum;
			
		
	} 
	}


