package basic_001;
import java.util.Scanner;
/*write a java code to compute x power y
 * input: 2 power 3
 * output: 8
 * if 
 *   
 *   else
 *   power value wo
 */
public class A011_pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter x: ");
		double x=s.nextDouble();
		System.out.println("enter y: ");
		double y=s.nextDouble();
		s.close();
		double p=Math.pow(x, y);
		if (x>=0 && y>=0) {
			System.out.println(x+" raised to the power of"+ y+" is:" +p);
		} else {
			System.out.println("Power not calculate for negative values");

		}
	}

}
