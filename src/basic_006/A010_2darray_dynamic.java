package basic_006;
import java.util.Scanner;
/*
 * input: 
 * enter row value: 
2
enter column value: 
3
enter array elements
1
2
3
4
8
7
output:
1 2 3 
4 8 7 

 */
public class A010_2darray_dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row value: ");
		int n=sc.nextInt();
		System.out.println("enter column value: ");
		int m=sc.nextInt();
		int[][] array=new int[n][m]; 
	
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j]=sc.nextInt();
			}
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
