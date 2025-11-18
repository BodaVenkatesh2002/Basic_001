package basic_006;

import java.util.Scanner;

public class A012_2darray_addtion_methods {
	public static void m1() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		

	}

}
