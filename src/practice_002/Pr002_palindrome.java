package practice_002;
// write a java code to print palindrome
//input=175, output=571->reverse of a given number
//input=175,output=
import java.util.Scanner;
public class Pr002_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter val: ");
		int val=s.nextInt();
		int rev=0;
		while(val>0) {
			rev=rev*10+val%10;
			val/=10;
			
			
		}
		
		System.out.println(rev);
		
	
		
		s.close();
		

	}

}
