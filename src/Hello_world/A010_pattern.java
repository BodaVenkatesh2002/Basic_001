package Hello_world;

import java.util.Iterator;

/* write a java code to print pattern even numbers
 * 
 */
public class A010_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 1; i <=50; i++) {
			if (i%2==0) {
				System.out.print(i);
				count++;
			
				
			}if (count%5==0) {
				System.out.println();
				
			}
			
			
			
			
			
		}
		

	}

}
