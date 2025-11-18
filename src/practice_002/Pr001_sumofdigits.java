package practice_002;
/* write a java code to print sum of digits
 * input:123
 * 
 * output=1+2+3=6 
 * 
 *output
 */
import java.util.Scanner;
public class Pr001_sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		int sum=0;
		sc.close();
		while (n!=0) {
			sum+=n%10;
			n/=10;
			
			
		}
		System.out.println(sum);

	}

}
