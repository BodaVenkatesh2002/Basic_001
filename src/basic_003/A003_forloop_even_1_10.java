package basic_003;
//write a java code to print even from 1 to 10
public class A003_forloop_even_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=10; i=i+2) {
			System.out.println(i);
			
		}
		System.out.println("with logic " );
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				System.out.println(i);
				
			}
			
		}

	}

}
