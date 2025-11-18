package basic_002;
//write a java code to print month
import java.util.Scanner;
public class A011_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value: ");
		int val=s.nextInt();
		String month;
		switch (val) {
		case 1:
			month="january";
			break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			
			
			break;
		case 12:
			month="December";
			break;

		default:
			month="Invalid month";
			break;
		}
		s.close();
		System.out.println("month is "+month);

	}

}
