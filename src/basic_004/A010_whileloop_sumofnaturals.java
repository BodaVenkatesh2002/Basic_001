package basic_004;
//write a java code to print sum of natural numbers upto n
import java.util.Scanner;
public class A010_whileloop_sumofnaturals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		int i=1;
		int sum=0;
		s.close();
		while (i<=n) {
			sum=sum+i;
			i++;
			
		}System.out.println("the sum of natural number is "+sum);

	}

}
