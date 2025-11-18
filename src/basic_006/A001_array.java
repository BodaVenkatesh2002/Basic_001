package basic_006;
// write a java code to print array
import java.util.Scanner;
import java.util.Arrays;
public class A001_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------Before Performing Array");
		int num1=10;
		int num2=30;
		int num3= 45;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		
		
		System.out.println("----------------------1.Static array input static array output");
		int[] a= {10,30,45,72};
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a); //Adrress of a is [I@515f550a
		

		
		System.out.println("----------------------2.Dynamic array input with static output");
		int array[]=new int[3];
		Scanner s=new Scanner(System.in);
		System.out.println("plese enter 3 array numbers:  ");
		for (int i = 0; i <3; i++) {
			
			array[i]=s.nextInt();
		}System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		
		System.out.println("----------------------2.Dynamic array input and output");
		int array_01[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("plese enter 3 array numbers:  ");
		for (int i = 0; i <3; i++) {
			
			array_01[i]=sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(array_01[i]);
			
		}


	}

}
