package Hello_world;
/* write a java code to print the pattern 
 *12345
678910
1112131415
1617181920
2122232425
*/

public class A008_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 1; i <=25; i++) {
			System.out.print(i);
			count++;
			if (count%5==0) {
				System.out.println();
			}
			
			
		}

	}

}
