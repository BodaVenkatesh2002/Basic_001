package practice_001;
//write a java code to check it is prime or not
import java.util.Scanner;
public class Pr006_primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		int count=0;
		if (n<=1) {
			System.out.println(n+" is not a prime");
			
		} else {
			for (int i = 1; i <=n; i++) {
				if(n%i==0) {
					count++;
					
				}
				
			}

		}if (count==2) {
			System.out.println(n+" is a prime ");
			
		} else {
			System.out.println(n+" is not a prime ");

		}
		

	}

}
