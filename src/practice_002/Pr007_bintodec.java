package practice_002;
// write a java code to print binary to decimal
import java.util.Scanner;
public class Pr007_bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter bin: ");
		String bin=s.nextLine();
		int dec=0;
		int pow=0;
		for (int i = bin.length()-1; i>=0; i--) {
			char bit=bin.charAt(i);
			if (bit=='1') {
				dec=(int) (dec+Math.pow(2, pow));
				
			}
			pow++;
			
		}
		System.out.println("the decimal number is "+dec);
		s.close();
		

	}

}
