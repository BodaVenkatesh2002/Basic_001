package basic_002;
// write a java code to print alu
import java.util.Scanner;

public class A012_Alu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Which operation to be perform:  ");
		
		int op=s.nextInt();
		System.out.println("enter a value:  ");
		double a=s.nextDouble();
		System.out.println("enter b value:  ");
		double b=s.nextDouble();
		switch (op) {
		case 1:
			System.out.println("1.ADDITION "+(a+b));
			break;
		case 2:
			System.out.println("2.Subtraction "+(a-b));
			break;
		case 3:
			System.out.println("3.MULTIPLICATION "+(a*b));
			break;
		case 4:
			System.out.println("4.DIVIISION "+(a/b));
			break;
		case 5:
			System.out.println("5.MODULO DIVISION "+(a%b));
			break;

		default:
			System.out.println("Invalid choice");
		}		
		s.close();
		
		
		
		

	}

}
