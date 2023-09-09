package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// Declare List
		//ArrayList<String> mentors = new ArrayList<>();
		List<String> mentors = new ArrayList<>();
		//to add items into a list
		mentors.add("Vidya");
		mentors.add("Aravind");
		mentors.add("Regu");
		mentors.add("Dilip");
		mentors.add(2,"Jagadesh");
		mentors.add("Kathir");
		//to find the size of the list
		int size = mentors.size();
		System.out.println("Size of the List is " + size);
		System.out.println("Values are : "+mentors);
		//to remove an item from the List
		mentors.remove(3);
		System.out.println("After Remove : "+mentors);
		
		//to retrieve a particular item from a List
		
		//String string = mentors.get(4);
		System.out.println(mentors.get(4));
		
		//clear(), isEmpty()
		
	}

}
