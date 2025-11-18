package basic_002;
// write a java code to find max among 2 numbers
import java.util.Scanner;
public class A005_maxof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1=s.nextInt();
		System.out.println("enter num2: ");
		int num2=s.nextInt();
		if (num1>num2) {
			System.out.println("max number is "+num1);
		} else if(num2>num1) {
			System.out.println("max number is "+num2);
			
		}else {
			System.out.println("Both "+num1+" and "+num2+" are equal ");
		}
		

	}

}

