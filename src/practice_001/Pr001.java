package practice_001;
/*
 * Given two integers, n and m. The task is to check the relation between n and m. 
Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m.

Examples :

Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'lesser'.
Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.
Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.
 */
import java.util.Scanner;
public class Pr001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		System.out.println("enter m: ");
		int m=sc.nextInt();
		
		sc.close();
		if (n<m) {
			System.out.println("lesser");
			
		} else if(n>m){
			System.out.println("greater");

		}else {
			System.out.println("equal");
		}
		

	}

}
