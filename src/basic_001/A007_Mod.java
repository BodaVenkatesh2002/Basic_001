package basic_001;

import java.util.Scanner;
//write a java code for modulo division of two numbers
public class A007_Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=s.nextInt();
		System.out.println("enter n2");
		int n2=s.nextInt();
		int mod=n1%n2;
		System.out.println("mod of "+n1+" and "+n2+" is "+mod );

	}

}
