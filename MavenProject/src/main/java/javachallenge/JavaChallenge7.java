package javachallenge;

import java.util.Iterator;

public class JavaChallenge7 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,4};
		boolean result=false;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					
					result = true;
					break;
				}
				
			}
			
		}
		System.out.println("Given Number Array is : " + result);
		

	}

}
