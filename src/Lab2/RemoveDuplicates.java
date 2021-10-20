package Lab2;
import java.util.Scanner;
public class RemoveDuplicates {
	public static int removeduplicates(int a[])
    {   int n=a.length;
        if (n == 0 || n == 1) {
            return n;
        }
  
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        for(int i=0; i<j;i++)
  	   {
  		   int t=0;
  		   for(int k=0; k<j-i-1;k++)
  		   {
  			   if(a[k]<a[k+1])
  			   {
  				   t=a[k];
  				   a[k]=a[k+1];
  				   a[k+1]=t;
  			   }
  		   }
  	   }
        
        return j;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
        int n = sc.nextInt();
         int a[]=new int[n];
         System.out.println("enter the values in array");
         for (int i = 0; i < n; i++)
        	 a[i]=sc.nextInt();
         int A = removeduplicates(a);
        System.out.println("Displaying Sorted Array");
        for(int i=0; i<A;i++)
        {
     	   System.out.println(a[i]+" ");
        }
	}
}
