package basic_002;

import java.util.Iterator;
/*write a java code to print no of digits
 * n=108
 * 108%10=
 * s=0
 * input=7
 * output=one digit
 * input=22
 * output= two digit
 * input=563
 * output=three digit
 * 
 * 
 */
import java.util.Scanner;

public class A008_nodigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter num: ");
		int num = s.nextInt();
		s.close();
		if (num<0) {
			System.out.println("Negative");
		}
		else if (num >= 0 && num <= 9) {
			System.out.println(+num + " is one digit");

		} else if (num >= 10 && num <= 99) {
			System.out.println(+num + "is two digit");

		} else if (num > 100 && num <= 999) {
			System.out.println(+num + "is three digit");
		} else {
			System.out.println("you entered more than a 3 digit number");
		}

	}

}
