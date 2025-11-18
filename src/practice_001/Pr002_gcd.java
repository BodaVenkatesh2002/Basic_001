package practice_001;
/*write a java code to find GCD of two numbers
 * first take two inputs and find min among two numbers 
 * 
 */

import java.util.Scanner;
public class Pr002_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=s.nextInt();
		System.out.println("enter b: ");
		int b=s.nextInt();
		int min=(a<b)?a:b;
		int gcd=1;
		s.close();
		for (int i = 1; i <=min; i++) {
			if (a%i==0&&b%i==0) {
				gcd=i;
				
				
			}
			
		}System.out.println("gcd of "+a+" and "+b+ " is "+gcd);
		

	}

}
