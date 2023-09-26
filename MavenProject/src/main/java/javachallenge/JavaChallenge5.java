package javachallenge;

public class JavaChallenge5 {

	public static void main(String[] args) {
		int n = 19,x;
		boolean result = true, exit;
		if (n<9) {
			
			exit = false;
			result = false;
		}else { 
			
			exit = true;
		}
		x=n;	
		while (exit){ 
			String str = String.valueOf(x);
			x=0;
			char[] strChar = str.toCharArray();
			for (int i = 0; i < strChar.length; i++) {
				x=x+(Character.getNumericValue(strChar[i])*Character.getNumericValue(strChar[i]));
				
			}
			if (x<9) {
				exit = false;
			}
			System.out.println("Explanation : " + x );
			
		}		
		
		System.out.println("Given No."+n+" is "+result);
			
	}	
		
		
}

