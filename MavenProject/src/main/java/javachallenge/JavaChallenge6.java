package javachallenge;

public class JavaChallenge6 {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,3,1,2,3,3,3,4,3,4,2,3};
		int bigCount=0, count, mValue=0, result=0;
		
		for (int i = 0; i < nums.length; i++) {
			count=1;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					count = count+1;
					mValue = nums[i];
				}
				
			}
			if (bigCount<count) {
				bigCount = count;
				result = mValue;
			}
			
			
			
		}
		System.out.println("Majority Number in the given array is " + result+" and count is " + bigCount);
	}

}
