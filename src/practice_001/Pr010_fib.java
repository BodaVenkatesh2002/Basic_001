package practice_001;
// write ajava code to print fibanocci

import java.util.Scanner;
public class Pr010_fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter fib: ");
		int fib=s.nextInt();
		int n1=0,n2=1;
		s.close();
		for (int i = 1; i <=fib; ++i) {
			System.out.println(n1);
			
			int n3=n1+n2;
		
			n1=n2;
			n2=n3;
					
			
		}

	}

}
