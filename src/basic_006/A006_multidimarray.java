package basic_006;
// write a java code to print multidimensional array
/*input:
 * enter array elements
1
2
5
4
output:
1 2 
5 4 

 */
import java.util.Scanner;
public class A006_multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array=new int[2][2]; 
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j]=s.nextInt();
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
