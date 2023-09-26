package javachallenge;

public class JavaChallenge2 {
	
	public static void main(String[] args) {
		
	
		double  remainder = 2.0d, sroot=0.0d;
		int input = 8;
		for (double i = 2; i>=remainder; i=i+.09) {
			sroot = i * i;
			if (input <= sroot) {
				System.out.println("Square root of "+input +" is : "+i);
				System.out.println("Square Root Round Of : "+ (int)i);
				break;
			}else {
				remainder = i + .01;
			}
				
		}
			
	}	
		

}
