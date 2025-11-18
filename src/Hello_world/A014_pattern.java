package Hello_world;
/* write a java code to print pattern 
5 6  15  16 25
4 7  14  17 24
3 8  13  18 23
2 9  12  19 22
1 10 11  20 21
 * 
 * 
 */
public class A014_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x;
		int y;
		for (int i = 1; i <=n; i++) {
			x=n-i+1;
			y=n+i;
			
			for (int j = 1; j <=n; j++) {
				if (j%2==1) {
					System.out.print(" "+x);
					
				
				}
				else  {if (j==4) {
					y=y+n+n;
				}
					
					
					System.out.print(" "+y);
				}
				x=x+n;
				
				
				
			}System.out.println();
			
		}

	}

}
