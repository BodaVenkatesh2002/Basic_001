package practice_002;
// write a java code to print arm strong or not  
import java.util.Scanner;
public class Pr005_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		
		int res=0;
		int original=n;
		
		
			
		
		while (n!=0) {
			int rem=n%10;
			res=res+(rem*rem*rem);
			
			
			n/=10;
			
			
		}
		
	if(res==original) {
		System.out.println(original+" is a armstrong");
	}
	else {
		System.out.println(original+" is not armstrong");
	}
	s.close();
		

	}

}
