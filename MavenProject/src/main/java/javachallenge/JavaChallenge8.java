package javachallenge;

import java.util.Iterator;

public class JavaChallenge8 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		boolean result = false;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if((nums[i]==nums[j]) && (Math.abs(i-j)<=k)) {
					result = true;
					
				}
				
			}
			
		}
		System.out.println("The Give Array is " + result);
		
		

	}

}
