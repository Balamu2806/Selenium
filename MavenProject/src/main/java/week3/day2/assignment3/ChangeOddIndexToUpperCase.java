package week3.day2.assignment3;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		String toUpper = "",temp;
		String test = "changeme";
		char[] ch = test.toCharArray();
		
		for (int i = 1; i<=ch.length ; i++) {
			
			if (i%2 == 1) {
				;
				toUpper = toUpper + Character.toString(ch[i-1]).toUpperCase();
				
			}else
			{
				toUpper = toUpper + Character.toString(ch[i-1]);
			}
		}
		
		System.out.println(toUpper);

	}

}
