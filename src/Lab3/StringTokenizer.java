package Lab3;
import java.util.Scanner;
public class StringTokenizer {


			public static void main(String[] args) {
				
				int n;
				int sum=0;
				//asking for user input
				Scanner scn= new Scanner(System.in);
				System.out.println("Enter integers: ");
				String str= scn.nextLine();
				
				StringTokenizer st= new StringTokenizer();
				System.out.println("All intergers: ");
				
				while(st.hasMoreTokens()) {
					
					String temp= st.nextToken();
					n= Integer.parseInt(temp);
					System.out.print(n+" ");
					sum+= n;
				}
				
				System.out.println();
				System.out.println("Sum of integers is: "+sum);
				
				
				//closing resourse
				scn.close();
			}

			private String nextToken() {
				// TODO Auto-generated method stub
				return null;
			}

			private boolean hasMoreTokens() {
				// TODO Auto-generated method stub
				return false;
			}
}
