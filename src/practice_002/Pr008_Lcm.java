package practice_002;
// write a java code to find lcm of 2 numbers
import java.util.Scanner;
public class Pr008_Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n1: ");
		int n1=s.nextInt();
		System.out.println("enter n2: ");
		int n2=s.nextInt();
		int min=(n1<n2)?n1:n2;
		int gcd=1;
		s.close();
		for (int i = 1; i <=min; i++) {
			if (n1%i==0&&n2%i==0) {
				gcd=i;
				
			}
			
		}
		int lcm=(n1*n2)/gcd;
		System.out.println("gcd is "+gcd);
		System.out.println("lcm is "+lcm);
		

	}
	

}
