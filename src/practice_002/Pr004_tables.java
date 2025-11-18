package practice_002;
// write a java code to print tables
import java.util.Scanner;
public class Pr004_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter table: ");
		int table=s.nextInt();
		for (int i = 1; i <=10; i++) {
			
			System.out.println(table+"x"+i+"="+(table*i));
			
		}
		
		s.close();
		
	}

}
