package basic_002;
//write a java code to find whether it is vowel or consonant using switch case
import java.util.Scanner;
public class A010_voworconswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter char: ");
		
		char ch=s.next().charAt(0);
		ch=Character.toLowerCase(ch);
		
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowel");
			
			
			
			break;

		default:
			if(ch>='a'&&ch<='z') {
				System.out.println(ch+" is consonant");
			}else {
				System.out.println("Invalid alphabet");
			}
			
		}
		s.close();
	

	}

}
