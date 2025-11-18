package basic_001;
import java.util.Scanner;
// write a java code for division of two numbers
public class A006_Div {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter n1");
	int n1=s.nextInt();
	System.out.println("enter n2");
	int n2=s.nextInt();
	double div=n1/n2;
	System.out.println("div of "+n1+" and "+n2+" is "+div );
	}
	
}
