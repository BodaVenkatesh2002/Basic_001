package basic_006;
//this example is sum of 2d array
/*
* input:
* enter array elements
1
2
5
4
output of 2d array is:
1 2 
5 4 
sum of all elements in 2d array is
12

*/

import java.util.Scanner;

public class A009_2darray_method_sum {
	public static void m1() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements ");
		int [][]a=new int[2][2];
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=s.nextInt();
				
				
			}
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum=sum+a[i][j];
				
				
			}
			
		}System.out.println("sum of all elements: "+sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
