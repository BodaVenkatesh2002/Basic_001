package practice_001;
//write a java code to print area of circle and rectangle using switch
import java.util.Scanner;
public class Pr004_switch_ar_rec_circle_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter choice: ");
		int choice=s.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println("enter r: ");
			double r=s.nextDouble();
			System.out.println("area of circle "+(Math.PI*Math.pow(r, r)));
			
			break;
		case 2:
			System.out.println("enter l: ");
			double l=s.nextDouble();
			System.out.println("enter b: ");
			double b=s.nextDouble();
			System.out.println("area of rectangle "+(l*b));
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
