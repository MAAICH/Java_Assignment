package Lab3;
import java.time.*;
import java.util.*;
public class CurrentSystemDate {
	 
	    
	      /*  LocalDate pdate = LocalDate.of(2020, 10, 20);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
}*/
		  //method used to write the logic
				public static int[] difference(LocalDate past_date, LocalDate today) {
					int[] m = new int[3];
					Period diff = Period.between(past_date, today);
					int years = diff.getYears();//it is used to get the amount of years of the particular period
					int months = diff.getMonths(); //this method returns the month 
					int date = diff.getDays(); //this method returns the day of the week 
					m[0] = date;
					m[1] = months;
					m[2] = years;
					return m;
				}
				//main method
				public static void main(String[] args) {  
					Scanner sc = new Scanner(System.in);  //read the user input
					//System.out.println("enter the local date");
					LocalDate past_date = LocalDate.of(1998, 03, 24); 
					/*
					 * LocalDate.of used to create an instance of LocalDate 
					 * from the input year, month and day of the month.
					 */
					LocalDate today = LocalDate.now();

					int[] m = difference(past_date, today);
					System.out.println("date: " + m[0] + "  month:" + m[1] + "  year:" + m[2]);

				}
		}
		