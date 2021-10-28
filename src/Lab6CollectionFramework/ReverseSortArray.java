package Lab6CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseSortArray {
	
	//method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
	public static List<Integer> getSorted(int[] nums) {
		List<Integer> l = new ArrayList<>();
		for(int i : nums) {
			//Converting the numbers to String to reverse it 
			StringBuilder sb = new StringBuilder(Integer.toString(i));
			sb.reverse();
			int num = Integer.parseInt(sb.toString());
			l.add(num);
		}
		//Using Collection API to sort it 
		Collections.sort(l);
		return l;
	}

	public static void main(String[] args) {
		int a[] = {45,81,64,35,76,28};
		List<Integer> l = getSorted(a);
		//Using an iterator to access the contents of the list
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}
}
