package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		/*set : its a Interface
		 		The Implementation Classes of Set
				HashSet 		:	Random Order
				LinkedHashSet	:	Insertion Order
				TreeSet			:	ACSII Order
		 		It cannot have duplicate values
		 		Set has same methods as that of List
		 		But Set Interface doesn't have get()-> the Order of Items depends on the Implementation class
				Set<String> set = new HashSet<>();
		
		*/
		
		int[] nums = {2,3,5,3,2,4,7,6,5};
		Set<Integer> set = new LinkedHashSet<>();
		//to add items to a set
		for (int i = 0; i <=nums.length-1; i++) {
			set.add(nums[i]);
			
		}
		
		System.out.println(set);
	}
		
	
	
	}


