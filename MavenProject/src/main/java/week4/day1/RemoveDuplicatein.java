package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatein {
	
	
	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char[] ch = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		Set<Character> dupset = new LinkedHashSet<>();
		
		//to add items to a set
		
		for (int i=0; i<ch.length; i++) {
			
			if (set.add(ch[i]) == false){
				dupset.add(ch[i]);
			}
			
		}
		System.out.println("After Duplicate Removed from the : " + set);
		System.out.println("Duplicate Character in the String is : " + dupset);
	}

}
