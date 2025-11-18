package basic_006;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// write a java code to print sorting
// sample input array={4,6,2,5,7,3} output array={2,3,4,5,6,7}
public class A004_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num= {4,6,2,5,6,7};
		int []arr= {9,5,7,10,5,6,3};
		
		Arrays.sort(num,Collections.reverseOrder());
		Arrays.sort(arr);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(arr));
		
		

	}

}

