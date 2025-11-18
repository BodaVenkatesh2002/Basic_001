package basic_001;
import java.util.Scanner;
//write a java code to find circle area
public class A013_cir2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=s.nextDouble();
		s.close();
		double ar=3.14*r*r;
		if (r>0) {
			System.out.println("circle area of "+r+" is "+ar);
			
		} else {
			System.out.println("negative values cannot be calculate");

		}
		

	}

}
