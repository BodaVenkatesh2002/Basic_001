package basic_006;
// write a java code to print sum of array from user input
import java.util.Scanner;
import java.util.Arrays;
public class A003_sumofarray_userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 Array Numbers:  ");
		
		int arr[]=new int[5];
		int sum=0;
		for (int i = 0; i <5; i++) {
			arr[i]=s.nextInt();
		}
		for (int i = 0; i <5; i++) {
			sum=sum+arr[i];
			
			
		}System.out.println(sum);
		
		
		
		
		System.out.println("sum of numbers in the array from the user input ");
		
		System.out.println("enter the size of the array :  ");
		int n= s.nextInt();
		System.out.println("the size of the array is "+n);
		System.out.println("please enter the "+n+" elements in the array ");
		int arr_01[]=new int[n];
		int sum1=0;
		for (int i = 0; i <n; i++) {
			arr_01[i]=s.nextInt();
		}
		for (int i = 0; i <n; i++) {
			sum1=sum1+arr_01[i];
			
			
		}System.out.println(sum1);

	}

}
