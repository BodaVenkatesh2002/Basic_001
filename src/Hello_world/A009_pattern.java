package Hello_world;
/* write a java code to print 13579
1113151719
2123252729
3133353739
4143454749

*/
public class A009_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 1; i <=49; i++) {
			if (i%2!=0) {
				System.out.print(i);
				count++;
			}
			if (count%5==0) {
				System.out.println();
				
			}
			
		}

	}

}
