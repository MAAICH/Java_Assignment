//Calculate the sum of n natural numbers which is divisible by 3 or 5
package Lab1;
import java.util.*;
public class CalculateSum {
     
	static int calculateSum(int n)
	{
		int sum=0,c=0,i=1;
		while(c<n)
		{
			if(i%3==0 || i%5==0) 
			{
				sum+=i;
				c++;
			}
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the nth value of natural number");
    n=sc.nextInt();
    System.out.println("The sum is : "+ calculateSum(n));
	}

}
