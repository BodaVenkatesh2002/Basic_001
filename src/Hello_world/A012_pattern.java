package Hello_world;
/* write a java code to print pattern 
1  10   11   20  21
2   9   12   19  22
3   8   13   18  23
4   7   14   17  24
5   6   15   16  25


5 10 15 20 25
4 9 14  19 24
3 8 13  18 23
2 7 12  17 22
1 6 11  16 21
*/
public class A012_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int n=5;
		for (int i = 1; i <=n; i++) {
			x=i;
			y=n-i+1;
			for (int j = 1; j <=n; j++) {
				if (j%2==1) {
					System.out.print(" "+x);
					
				}
				else{
					System.out.print(" "+y);
				}
				x=x+n;
				y=y+n;
				
			}
			System.out.println();
			
		}

	}

}
