package basic_001;
import java.util.Scanner;

/*
 * write a java code to find square root
 * input=enter value: 25
 * output: sqrt value is 5
 */
public class A010_srt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter value: ");
		double val = s.nextDouble();
		if (val >= 0) {
			double sqrt = Math.sqrt(val);
			System.out.println("sqrt value is " + sqrt);

		} else {
			System.out.println("Cannot calculate square root for negative values");

		}

	}

}
