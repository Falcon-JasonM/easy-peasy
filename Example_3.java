package toots;

import java.util.Arrays;

public class Example_3 {

	public static void main(String[] args) {
		
		//supply integer array and search variable
		int [] intArray = {4321, -115, 12, 55, 77, -1234, 95, -14};
		int searchNumber = 4321;
	
		//append the original array to have ".index number" in the decimal positions
		double[] appArray2 = new double[intArray.length];
		for (int i = 0; i <= intArray.length-1; i++) {
			
			appArray2[i] = ((double)intArray[i] + (intArray[i] / Math.abs(intArray[i]) * 0.0001 * i));
			//System.out.println(appArray2[i]);
			}
		
		
		//sort the appended array numerically
		Arrays.sort((double[])appArray2);
		
		//create a class instance
		Example_3 ex3 = new Example_3();
		
		//call the method here
		System.out.println("The index of the searched number is: " + ex3.arrSearch(appArray2, searchNumber));
	}
	
	//Implement a binary search using recursion. Should search in an array and return the searched number which is now
	//appended to include the index after the decimal point.
	//If the number is not in the array, then return -1

	
	public int arrSearch(double[] input, int target) {
	
	if (input == null || input.length <= 0) return -1;
	
	
	//establish local variables and temps
	int minRange = 0;
	int maxRange = input.length - 1;
	int midpoint = 0;
	
	//implement the binary search with a while loop
	while(minRange <= maxRange) {
		
		midpoint = ((int)minRange + (int)maxRange)/2;
		
				//System.out.println(midpoint); 
				if((int)input[midpoint] < target) {
					minRange = midpoint +1;
				}else if((int)input[midpoint] > target) {
					maxRange = midpoint - 1;
				//return the new value of the sorted and indexed number which will have ".index number" tagged onto the end
				//subtract the number from itself to get just the decimal portion, then multiply by an appropriate number to return the original index 
				//value in integer format
				}else return (int)Math.abs((int)((input[midpoint] - (int)input[midpoint]) * 10E3));
   }
	//if int not found
	return -1;
	
	}
}

