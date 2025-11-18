package basic_002;
//write a java code to find whether vowel or consonant

 
import java.util.Scanner;
public class A003_vowelorcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter character: ");
		char vc=s.next().charAt(0);
		s.close();
		if (vc=='a'||vc=='A'||vc=='e'||vc=='E'||vc=='i'||vc=='I'||vc=='o'||vc=='O'||vc=='u'||vc=='U') {
			System.out.println("given char is vowel ");
			
		} else {
			System.out.println("given char is Consonant ");

		}
		
		

	}

}
