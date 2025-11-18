package basic_006;
/*
 * input 

 * enter array elements
1
2
5
4
output 2d array:
1 2 
5 4 

sum of even in 2d array
6
 */
import java.util.Scanner;
public class A007_sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements: ");
		int a[][]=new int[2][2];
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=s.nextInt();
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j]%2==0) {
					sum=sum+a[i][j];
				}
					
				}
			
		}System.out.println("sum of even elements is: "+sum);
		

	}

}
