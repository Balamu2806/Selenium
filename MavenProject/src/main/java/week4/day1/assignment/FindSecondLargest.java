package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};

				//a) Create a empty Set Using TreeSet
				Set<Integer> set = new TreeSet<>();
				//b) Declare for loop iterator from 0 to data.length and add into Set
				for (int i = 0; i < data.length; i++) {
					set.add(data[i]);
					
				}
				//System.out.println(set);
				//System.out.println(set.remove(data[1]));
				
				//c) converted Set into List
				List<Integer> list = new ArrayList<>(set);
				
				//d) Print the second last element from List
				System.out.println("Second Largest in the given List is : " + list.get(list.size()-2));
	}

}
