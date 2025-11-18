package basic_002;
//write a java code to find max of four
import java.util.Scanner;

public class A007_maxoffour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=s.nextInt();
		System.out.println("enter num2");
		int num2=s.nextInt();
		System.out.println("enter num3");
		int num3=s.nextInt();
		System.out.println("enter num4");
		int num4=s.nextInt();
		s.close();
		if (num1>num2&&num1>num3&&num1>num4) {
			System.out.println("max number is: "+num1);
			
		} else if(num2>num1&&num2>num3&&num2>num4) {
			System.out.println("max number is: "+num2);

		}else if(num3>num1&&num3>num2&&num3>num4) {
			System.out.println("max number is: "+num3);
		}else {
			System.out.println("max number is: "+num4);
		}
		

	}
}