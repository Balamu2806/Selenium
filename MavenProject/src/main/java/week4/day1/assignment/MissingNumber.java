package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		//Input number 1-10 and 8 is missing
		int[] num = {1,2,3,4,5,6,7,9,10};
		
		//Declare empty set
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < num.length; i++) {
			
			set.add(num[i]);
			
		}
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		
		for (int i = 0; i < num.length; i++) {
			if(list.get(i)!= i+1) {
				System.out.println("Missing No is : " + (i+1) );
				break;
			}
			
		}
		
		
		
		
		
		
		

	}

}
