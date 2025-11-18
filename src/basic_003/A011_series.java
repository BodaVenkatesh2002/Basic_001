package basic_003;
/* write a java code to print sum of series is 1^0+2^1+3^2+4^3.....
 * 1^2+2^2+3^2+4^2.....
 * 
 * 
 * 1^0+2^1+3^2
 * 1+2+9=12
 */
import java.util.Scanner;
public class A011_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		int sum=0;
		for (int i = 1; i <=n; i++) {
			sum= (int) (sum+Math.pow(i, i-1));
			
			
		}System.out.println("the value of sum of series is "+sum);
		s.close();

	}

}
