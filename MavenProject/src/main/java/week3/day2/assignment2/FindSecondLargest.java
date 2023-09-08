package week3.day2.assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		// 1) Arrange the array in ascending order
		Arrays.sort(data);
		
		// 2) Pick the 2nd element from the last and print it
		System.out.println("Second Largest No in Arrays is : " +data[data.length-2]);
	}

}
