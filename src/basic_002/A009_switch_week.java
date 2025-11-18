package basic_002;

// write a java code to print the week
import java.util.Scanner;

public class A009_switch_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter num: ");
		int num = s.nextInt();

		String weekday;
		switch (num) 
		{
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wednesday";
			break;
		case 4:
			weekday = "Thursday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		case 7:
			weekday = "Sunday";
			break;
		default:
			weekday="Invalid day";

		}
		System.out.println("week day is " +weekday);
		s.close();
	}

}
