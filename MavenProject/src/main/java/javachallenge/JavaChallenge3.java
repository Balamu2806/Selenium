package javachallenge;

public class JavaChallenge3 {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama", reverse="";
		String alapha = str.replaceAll("[^A-Za-z]","");
		alapha = alapha.toLowerCase();
		char[] convertStr = alapha.toCharArray();
		
		
		for (int i = convertStr.length-1; i >=0 ; i--) {
			reverse = reverse + convertStr[i];
			
		}		
				
		if (alapha.equals(reverse)) {
			
			System.out.println("Give String "+ alapha + " is a Palindrome.");
		}else {
			
			System.out.println("Give String "+ alapha + " is Not a Palindrome.");
		}
			

	}

}
