package basic_006;
/*
 * input:
 * enter array elements
1
2
5
4
output of first 2d array is:
1 2 
5 4 

enter array elements
5
4
3
2

output of second 2d array is: 
5 4
3 2

sum of both arrays in 2d array:
6 6
8 6


a=5
b=2
c=a+b=5+2=7

a[i][j]=1,2,5,4
b[i][j]=5,4,3,2
c[i][j]=a[i][j]+b[i][j]

1  2  3  4  5  6  7  8
9  10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
  */
import java.util.Scanner;
public class A011_2dsum_with2d_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a-matrix elemnets: ");
		
		int a[][]=new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=s.nextInt();		
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println("enter b-matrix elemnets: ");
		int b[][]=new int[2][2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j]=s.nextInt();		
			}		
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]+" ");
		
			}
			System.out.println();
		}
		System.out.println("Sum of both matrices");
		int c[][]=new int[2][2];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");		
			}
			System.out.println();
		}
		
	
	
	}

}
