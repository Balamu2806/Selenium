package week3.day2.assignment3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 
		//	* a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";	
		//  * d) Initialize another loop to check whether the word is there in the array
		String[] arr = text.split(" ");	
		for (int i=0; i<arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ((arr[i].length()>0)&&(arr[i].equals(arr[j]))) {					
					arr[j] = "";					
				}				
			}
			if (arr[i].length()>0){
				System.out.print(arr[i]+" ");
			}
		}
			
		//* e) if it is available then increase and count by 1. 
		 //* f) if the count > 1 then replace the word as "" 
		 
	//	 * g) Displaying the String without duplicate words	
		

	}

}
