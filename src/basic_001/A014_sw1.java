package basic_001;
import java.util.Scanner;
//write a java code to print swapping of two numbers with 3rd variable 
public class A014_sw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter first_number");
		int first=s.nextInt();
		System.out.println("enter second_number");
		int second=s.nextInt();
		s.close();
		int temp=first;
		first=second;
		second=temp;
		System.out.println("swapping of two numbers is "+first+" "+second);
			
		
		

	}

}
