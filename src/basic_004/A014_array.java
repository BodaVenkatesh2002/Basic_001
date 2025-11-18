package basic_004;
import java.util.Arrays;
public class A014_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50};
		//System.out.println(num[1]);
		int index=0;
		for (int i : num) {
			if (index==1) {
				System.out.println("elements of array[1] "+num[1]);
				break;
				
			}index++;
			
		}

	}

}
