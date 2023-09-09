package week4.day1.assignment;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatein {
	
	
	public static void main(String[] args) {
		
		String str = "google";
		
		char[] ch = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		
		//to add items to a set
		
		for (char eachChar : ch) {
			
			set.add(ch[eachChar]);
			
		}
		/*for (int i = 0; i <=ch.length-1; i++) {
			set.add(ch[i]);
			
		}*/
		System.out.println(set);
	}

}
