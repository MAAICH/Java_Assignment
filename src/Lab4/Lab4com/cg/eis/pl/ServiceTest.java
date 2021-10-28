package Lab4com.cg.eis.pl;

import java.security.Provider.Service;
import java.util.Scanner;

public class ServiceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id num");
		int idNum = sc.nextInt();
		
		System.out.println("enter name");
		String name = sc.next();
		
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		
		System.out.println("enter designation");
		String designation = sc.next();
		
		System.out.println("enter insurance scheme");
		String insuranceScheme = sc.next();

		// ServiceInterface service=new Service();
		// service.retirement();
	}
}
