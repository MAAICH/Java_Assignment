package Day2ClassWork;

public class MaxArray {
public static void main(String[] args) {
	int[] a= {6,5,3,8,9,3};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println("maximum element is "+max);
}
}