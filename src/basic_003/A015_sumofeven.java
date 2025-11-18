package basic_003;

/*write a java code to print sum of even numbers from user input
 * n=5, output=2+4=6
 * n=10,output=2+4+6+8+10=30 try with float and double
 * 
 */
import java.util.Scanner;

public class A015_sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter numbber: ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 2; i < n; i = i + 2) {
			sum += i;

		}
		System.out.println(sum);

	}

}
