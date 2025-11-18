package practice_002;
// write a java code to print decimal to binary
import java.util.Scanner;

public class Pr006_dectobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter dec: ");
		int dec=s.nextInt();
		String bin="";
		int n=dec;
		
		
		while(n!=0) {
			bin=bin+(n%2);
			n=n/2;
			
		}
		System.out.println("binary number is "+bin);
		s.close();

	}

}
