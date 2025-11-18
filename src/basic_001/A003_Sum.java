package basic_001;

import java.util.Scanner;

//write a java program sum of two numbers
public class A003_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_number=10;
		int second_number=30;
		int sum=first_number+second_number;
		System.out.println("sum "+"of "+first_number+" and "+second_number+" is "+sum);	
		
		//sum of two numbers from user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int first_num=sc.nextInt();
		System.out.println("enter second number");
		int second_num=sc.nextInt();
		int sum1=first_num+second_num;
		System.out.println("sum1 "+"of "+first_num+" and "+second_num+" is "+sum1);	

		
		
	}

}
