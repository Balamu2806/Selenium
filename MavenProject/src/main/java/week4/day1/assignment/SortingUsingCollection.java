package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] str = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < str.length; i++) {
			
			list.add(str[i]);			
		}
			
		Collections.sort(list);
		
		for (int i = list.size()-1; i >= 0 ; i--) {
		
			System.out.print("'" + list.get(i)+ "' ");
		}	
	}
}
