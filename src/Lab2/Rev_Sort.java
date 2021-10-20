package Lab2;
import java.util.Scanner;
public class Rev_Sort {
	private static int[] getSorted(int[] arr)
    {
 	   for(int i=0;i<arr.length ; i++)
 	   {
 		   if(arr[i]>9)
 		   {
 			   int n = arr[i];
 			   int rev=0;
 			   int r=0;
 			   
 			   while(n>0)
 			   {
 				   r=n%10;
 				   rev=rev*10+r;
 				   n=n/10;
 			   }
 			   arr[i]=rev;
 		   }
 	   }
 	  System.out.println("After rev");
 	  for(int i=0; i<arr.length;i++)
      {
   	   System.out.println(arr[i]+" ");
      }
 	   
 	   for(int i=0; i<arr.length-1;i++)
 	   {
 		   int temp=0;
 		   for(int j=0; j<arr.length-i-1;j++)
 		   {
 			   if(arr[j]>arr[j+1])
 			   {
 				   temp=arr[j];
 				   arr[j]=arr[j+1];
 				   arr[j+1]=temp;
 			   }
 		   }
 	   }
 	   
 	   return arr;
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the values in array");
       for(int i=0; i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       int Arr[]=new int[n];
       Arr=getSorted(arr);
       System.out.println("Displaying Sorted Aray");
       for(int i=0; i<Arr.length;i++)
       {
    	   System.out.println(Arr[i]+" ");
       }
       
       
	}

}
