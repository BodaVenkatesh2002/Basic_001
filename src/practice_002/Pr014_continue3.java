package practice_002;

public class Pr014_continue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
        while (i < 5) {
            i++;
            if (i == 2) {
                continue; // skips printing when i is 2
            }
            System.out.println("i = " + i);
        }


	}

}
