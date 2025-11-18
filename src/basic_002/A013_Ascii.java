package basic_002;
//write a java code to print ascii values
import java.util.Scanner;
public class A013_Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter ch: ");
		char ch=s.next().charAt(0);
		s.close();
		System.out.println("Ascii value of "+ch+" is " +(int)ch);

	}

}
