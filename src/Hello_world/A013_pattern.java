package Hello_world;
/*
5 10 15 20 25
4 9 14  19 24
3 8 13  18 23
2 7 12  17 22
1 6 11  16 21

5 6  15  16 25
4 7  14  17 24
3 8  13  18 23
2 9  12  19 22
1 10 11  20 21


*/
public class A013_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x;
		//row=1 and column=1, output=1, we need to make into  5 
		//row=1 and column=2, output=1, we need to make into 10
		//......
		//row=1 and column=5, output=1, we need to make into 25-> then column will incremented with 6 then it will exit j and i will increment into  2
		//row=2 and column=1, output=2, we need to make into 4 
		//row=2 and column=2, output=?, we need to make into 9
		//......
		//row=6 and column=6,->end of the program for loop will end here.
		for (int i = 1; i <=n; i++) {
			//i=1,1<=5 ->it will continue upto j=5 if j=6 then i value incremented.
			//i=2,2<=5 ->it will continue upto j=5 if j=6 then i value incremented.
			x=n-i+1;
			//x=5-1+1=5,->value of row1 and column1
			//x=5-2+1=4,->value of row2 and column2
			//......
			for (int j = 1; j <=n; j++) {
				System.out.print(" "+x); 
				//5,10,15,20,25
				//4, 9,14,19,24
				//....
				//System.out.print(" " +j);
				x=x+n; 
				//x=5+5=10,x=10+5=15,x=15+5=20,x=20+5=25,x=25+j=25+6,->after j=6 condition fail
				//x=4+5=9 ,x= 9+5=14,x=14+5=19,x=19+5=24,x=24+j=24+6,->after j=6 condition fail
				//......
				
			}
			System.out.println();
			
		}

	}

}
