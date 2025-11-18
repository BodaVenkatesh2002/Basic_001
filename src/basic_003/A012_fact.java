package basic_003;

import java.util.Scanner;

//write a java code to print fact
public class A012_fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		s.close();
		
		int fact=1;
		for (int i = 2; i <=n; i++) {
			fact=fact*i;
			
			
		}System.out.println("factorial of "+n+" is "+fact);


	}

}
