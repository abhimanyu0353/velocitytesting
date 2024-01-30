package arrays.arr;

import java.util.Arrays;

public class Mergingndsorting {
	public static void main(String[] args) {
		
		int[] firstArray = {8,52,75,65,89};        //source array  
		int[] secondArray = {7,1,53,96};  //destination array  
		int fal = firstArray.length;        //determines length of firstArray  
		int sal = secondArray.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);  
		System.out.println(Arrays.toString(result));    //prints the resultant array  
	
		
		Arrays.sort(result);
	System.out.println(Arrays.toString(result));
	}

}
