package week3.day2.assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				Arrays.sort(arr);					

				// loop through the array (start i from arr[0] till the length of the array)
				for (int i = 1; i < arr.length; i++) {
					
				// check if the iterator variable is not equal to the array values respectively
					if (arr[i-1] != i) {
						// print the number
						System.out.println("Missing No is " +i);
						
						// once printed break the iteration
						break;
					}
				}
	}

}
