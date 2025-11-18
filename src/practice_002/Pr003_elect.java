package practice_002;
/*write a java code to find electricity bill cost
 * total unit consumed=280
 * Below 100 units =cost per one unit is 1.20Rs
 * next 200 units =cost per one unit is 2Rs
 * above 300 units= cost per one unit is 3Rs 
 * 
 */

public class Pr003_elect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0;
		int units=280;
		if (units<100) {
			total=units*1.20;
			
		} else if(units<200) {
			total=100*1.20+(units-100)*2;

		}else {
			total=100*1.20+200*2+(units-300)*3;
		}
		System.out.println("the total cost is "+total);

	}

}
