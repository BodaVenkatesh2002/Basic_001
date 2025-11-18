package Hello_world;
/* write a java code to print
5
54
543
5432
54321
*/
public class A007_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i>=1; i--) {
			for (int j = 5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
