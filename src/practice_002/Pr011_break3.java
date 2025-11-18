package practice_002;

public class Pr011_break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        while (true) {
            System.out.println("Count: " + count);
            count++;
            if (count == 5) {
                break; // exit infinite loop
            }
        }


	}

}
