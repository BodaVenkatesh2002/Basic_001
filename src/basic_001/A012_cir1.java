package basic_001;
import java.util.Scanner;
//write a java code to print circle area
public class A012_cir1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=s.nextDouble();
		s.close();
		double ar=Math.PI*Math.pow(r, 2);
		if (r>0) {
			System.out.println("area of circle with "+r+" is "+ar);
			
		} else {
			System.out.println("Not valid for negative numbers");

		}
		
		

	}

}
