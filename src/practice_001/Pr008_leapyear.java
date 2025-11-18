package practice_001;
// write a java code to check whether it is leap year or not
import java.util.Scanner;
public class Pr008_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter year:  ");
		int leap_year=s.nextInt();
		s.close();
		if((leap_year%4==0&&leap_year%100!=0)||(leap_year%400==0)) {
			System.out.println(leap_year+" is leap year");
		}else {
			System.out.println(leap_year+" is  not a leap year");
		}

	}

}
