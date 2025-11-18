package practice_001;
//write a java code to convert ascii to char
import java.util.Scanner;

public class Pr003_asci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter ascii: ");
		int ascii=s.nextInt();
		char ch=(char)ascii;
		System.out.println(ch);
		s.close();
		

	}

}
