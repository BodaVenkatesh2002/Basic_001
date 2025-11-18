package basic_002;
import java.util.Scanner;
public class A014_VALUETOASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:  ");
		int num=s.nextInt();
		s.close();
		if (num>=65&&num<=127) {
			System.out.println(+(char)num);
			
		} else {
			System.out.println("Invalid");

		}

	}

}
