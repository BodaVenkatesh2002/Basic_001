package basic_002;
//write a java code to find even or odd
import java.util.Scanner;
public class A002_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num: ");
		int num=s.nextInt();
		s.close();
		if (num>=0&&num%2==0) {
			System.out.println("number is even");
		} else if(num>=0&&num%2!=0) {
			System.out.println("number is odd");
			

		}else {
			System.out.println("negative numbers will not be calculate");
		}

	}

}