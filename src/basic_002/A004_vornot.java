package basic_002;

import java.util.Scanner;

public class A004_vornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter character: ");
		char vc=s.next().charAt(0);
		s.close();
		char lowercase=Character.toLowerCase(vc);
		if (lowercase=='a'||lowercase=='e'||lowercase=='i'||lowercase=='o'||lowercase=='u') {
			System.out.println("given char is vowel ");
			
		} else {
			System.out.println("given char is Consonant ");

		}

	}

}
