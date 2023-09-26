package javachallenge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class JavaChallenge4 {

	public static void main(String[] args) {
	int[] num = {4,1,2,1,2};	
	
	Set<Integer> set = new LinkedHashSet<>();
	
	for (int i = 0; i < num.length; i++) {
  		set.add(num[i]);
	}
	
	List<Integer> list = new ArrayList<>();
		
	for (int i = 0; i < num.length; i++) {
  		list.add(num[i]);
	}
	
	for (int i = 0; i < list.size(); i++) {
		for (int j = i+1; j < list.size(); j++) {
			
			if (list.get(i)== list.get(j)) {
				
				set.remove(num[i]);
			}
			
		}
		
	}
	
	System.out.println("Non Duplicate No in the series of "+list +" is "+set);
	
	
	/*for (int i = 0; i < list.size(); i++) {
		
		System.out.println(list.get(i));

		for (int j = 0; j<num.length;j++) {
			
		if (list.get(i)!=num[j] && (exist)) 
			nonDuplicate = list.get(i);
			//System.out.println(list.get(i));
		}
			
		}
		
	}*/


	
	
	

	}

}
