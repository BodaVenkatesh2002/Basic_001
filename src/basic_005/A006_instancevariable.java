package basic_005;
import java.util.Scanner;
public class A006_instancevariable {
	public void m1() {
		Scanner s=new Scanner(System.in);
				
		System.out.println("enter a: ");
		int a=s.nextInt();
		System.out.println("enter b: ");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("the addition of "+a+" and "+b+" is " +c);
		s.close();
	}
	public void m2() {
		Scanner s=new Scanner(System.in);
				
		System.out.println("enter a: ");
		int a=s.nextInt();
		System.out.println("enter b: ");
		int b=s.nextInt();
		int c=a-b;
		System.out.println("the Subtraction of "+a+" and "+b+" is " +c);
		s.close();
		
	}
	public void m3() {
		Scanner s=new Scanner(System.in);
				
		System.out.println("enter a: ");
		int a=s.nextInt();
		System.out.println("enter b: ");
		int b=s.nextInt();
		int c=a*b;
		System.out.println("the Multiplication of "+a+" and "+b+" is " +c);
		s.close();
	}
	public void m4() {
		Scanner s=new Scanner(System.in);
				
		System.out.println("enter a: ");
		int a=s.nextInt();
		System.out.println("enter b: ");
		int b=s.nextInt();
		int c=a/b;
		System.out.println("the Division of "+a+" and "+b+" is " +c);
		s.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A006_instancevariable obj=new A006_instancevariable();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
		
		
		
		

	}

}
