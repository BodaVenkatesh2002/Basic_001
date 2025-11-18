package basic_006;

import java.util.Scanner;

public class A015_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows: ");
		int n=s.nextInt();
		System.out.println("enter columns: ");
		int m=s.nextInt();
		System.out.println("enter a-matrix elements: ");
		int [][]a=new int[m][n];
		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=s.nextInt();
				
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("enter b-matrix elements: ");
		int [][]b=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j]=s.nextInt();
				
			}
			
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("division of both matrices is :  ");
		int [][]c=new int[m][n];
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j]=a[i][j]/b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
