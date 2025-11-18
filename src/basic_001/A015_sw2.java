package basic_001;

import java.util.Scanner;
//write a java code to print swapping of two numbers without 3rd variable 
public class A015_sw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter first_number");
		int first=s.nextInt();
		System.out.println("enter second_number");
		int second=s.nextInt();
		s.close();
		System.out.println("Before Swapping first number is "+first+"and second number is "+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After swapping  first number is "+first+"and second number is "+second);
			
		

	}

}
