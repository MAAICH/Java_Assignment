package Lab6CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class VotersList {

	// method which accepts the id and the age of people as a Map and decide if they
	// are eligible for vote
	// Returns the list of the ids of the people eligible for vote
	public static List<String> votersList(HashMap<String, Integer> map) {
		ArrayList<String> al = new ArrayList<>();
		for (String id : map.keySet()) {
			int age = map.get(id);
			if (age > 18)
				al.add(id);
		}
		return al;
	}

	public static void main(String[] args) {
		// Creating an HashMap with id as key age as value
		HashMap<String, Integer> map = new HashMap<>();
		map.put("GH879213", 60);
		map.put("GH79813", 48);
		map.put("G879213", 56);
		map.put("G789731", 25);
		map.put("F588123", 17);
		map.put("E898232", 8);
		map.put("JI978778", 40);

		// Calling votersList() method and storing the ids of people eligible to vote
		List<String> l = votersList(map);
		Iterator<String> itr = l.iterator();
		System.out.println("The IDs of people eligible to vote : ");
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}