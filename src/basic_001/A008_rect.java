package basic_001;
import java.util.Scanner;
public class A008_rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		int length=s.nextInt();
		s.close();
		System.out.println("enter Breadth");
		int Breadth=s.nextInt();
		int area=length*Breadth;
		System.out.println("area of "+length+" and "+Breadth+" is "+area);

		
		Scanner scanner=new Scanner(System.in);
		scanner.close();
	}

}
