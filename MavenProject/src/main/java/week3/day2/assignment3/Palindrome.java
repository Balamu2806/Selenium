package week3.day2.assignment3;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */


		String a = "madam",rev = "";
		char[] ch = a.toCharArray();
		
		for (int i = a.length()-1; i >=0 ; i--) {
			rev = rev+ ch[i];
			
		}
		if (rev.equals(a)) {
			System.out.println(a+" is a Palindrome");
		}
		else {
			
			System.out.println(a+" is not a Palindrome");
			
		}
	}

}
