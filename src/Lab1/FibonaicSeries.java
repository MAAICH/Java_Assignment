package Lab1;
import java.util.Scanner;
class FibonaicSeries {
static int Fibonaic1(int n) {
	if(n<=1)
		return n;
	return Fibonaic1(n-1)+ Fibonaic1(n-2);
}
static int Fibonaic(int n) {
	int f[] = new int[n+2];
	int i;
	f[0]=0;
	f[1]=1;
	for(i=2;i<=n;i++) {
		f[i]= f[i-1]+f[i-2];
	}
	return f[n];
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the nth value");
int n=sc.nextInt();
System.out.println("Fibonaic of "+n + "th value using recursion is : "+Fibonaic1(n));
System.out.println("Fibonaic of "+n + "th value  without using recursion is : "+Fibonaic(n));
	}

}
