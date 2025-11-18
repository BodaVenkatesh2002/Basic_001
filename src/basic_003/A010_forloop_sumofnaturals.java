package basic_003;
/* write a java code to print sum of natural numbers upto n
 * n=3
 * natural numbers are upto 3=1,2,3
 * sum of natural is 1+2+3=6
 * 
 */
import java.util.Scanner;
public class A010_forloop_sumofnaturals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		
		System.out.println("sum of natural numbers ");
		int sum=0;
		for (int i = 1; i <=n; i++) {
			sum=sum+i;
			
			
		}
		System.out.println(sum);

	}

}
