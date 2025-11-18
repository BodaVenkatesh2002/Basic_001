package practice_001;
/*write a java code to print reverse of a string
 * str=venkatesh
 */


import java.util.Scanner;

public class Pr005_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter str: ");
		String str=s.next();
		System.out.println(str.length());
		String reverse="";
		for (int i = str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
			
		}
		System.out.println("original str: "+str);
		System.out.println("reverese str: "+reverse);
		

	}

}
