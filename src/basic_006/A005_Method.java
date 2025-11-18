package basic_006;

import java.util.Arrays;

public class A005_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_01 = { 13, 21, 4, 7, 23 };// we are trying to use this array just for printing
		m1(num_01);

		int[] num_02 = { 23, 17, 19, 22, 65, 32 };// we are trying to use this array with arrays.sort
		System.out.println();
		m2(num_02);
		System.out.println();

		int[] num_03 = { 8, 5, 1, 9, 3, 22 };// we are trying to use this array for Manual sorting of array
		m3(num_03);
	}

	public static void m1(int num_01[]) {
		System.out.println("normal array m1()");
		for (int i = 0; i < num_01.length; i++) {
			System.out.print(" " + num_01[i]);
		}
	}

	public static void m2(int[] num_02) {
		System.out.println("sorting array m2() ");
		// sorting array with Arrays.sort
		Arrays.sort(num_02);
		for (int i = 0; i < num_02.length; i++) {
			System.out.print(" " + num_02[i]);
		}
	}

	public static void m3(int num_03[]) {
		// int[] num_03 = { 8, 5, 1, 9, 3, 22 };
		System.out.println("sorted array m3()");
		for (int i = 0; i < num_03.length; i++) {
			// i=0;0<6
			// i=1;1<6
			// i=2;2<6
			for (int j = i + 1; j < num_03.length; j++) {
				// j=1;1<6
				// j=2;2<6
				// .....

				// j=6;6<6=> condition fail then end of j loop and 'i' will increment
				// j=1;1<6
				// j=2;2<6
				// ....
				// j=6;6<6=> condition fail then end of j loop and 'i' will increment

				// j=1;1<6
				// j=2;2<6
				// ....
				// j=6;6<6=> condition fail then end of j loop and 'i' will increment

				// Before swapping of index 0=8 and index 1=5
				// System.out.print(" "+num_03[i]);
				// num_03[0]=8
				// num_03[0]=5
				// System.out.print(" "+num_03[j]);
				// num_03[1]=5
				// num_03[2]=1
				if (num_03[i] > num_03[j]) {
					// num_03[0]>num_03[1]=>8>5
					// num_03[0]>num_03[2]=>5>1
					int temp = num_03[i];
					// temp=num_03[0]=8
					// temp=num_03[0]=5
					num_03[i] = num_03[j];
					// num_03[0]=num_03[1]=>num_03[0]=5
					// num_03[0]=num_03[2]=>num_03[0]=1
					num_03[j] = temp;
					// num_03[1]=temp=>num_03[1]=8
					// num_03[2]=temp=>num_03[2]=5
				}
				// after swapping of index 0=5 and index 1=8

				// System.out.print(" "+num_03[i]);
				// num_03[0]=5
				// num_03[0]=1
				// System.out.print(" "+num_03[j]);
				// num_03[1]=8
				// num_03[2]=5
				// num_03=5,8,1,9,3,22=>i=0,j=1
				// num_03=1,8,5,9,3,22=>i=0,j=2
				// num_03=1,8,5,9,3,22=>i=0,j=3
				// num_03=1,8,5,9,3,22=>i=0,j=4
				// num_03=1,8,5,9,3,22=>i=0,j=5
				// =>i=0,j=6 Now J loop will fail then 'i' will incremented from i=0 to i=1

				// num_03=1,8,5,9,3,22=>i=1,j=2
				// num_03=1,5,8,9,3,22=>i=1,j=3
				// num_03=1,5,8,9,3,22=>i=1,j=4
				// num_03=1,3,8,9,5,22=>i=1,j=5
				// =>i=1,j=6 Now J loop will fail then 'i' will incremented from i=1 to i=2

				// num_03=1,3,8,9,5,22=>i=2,j=3
				// num_03=1,3,8,9,5,22=>i=2,j=4
				// num_03=1,3,8,9,5,22=>i=2,j=5
				// =>i=2,j=6 Now J loop will fail then 'i' will incremented from i=2 to i=3

				// num_03=1,3,5,9,8,22=>i=3,j=4
				// num_03=1,3,5,8,9,22=>i=3,j=5
				// =>i=3,j=6 Now J loop will fail then 'i' will incremented from i=3 to i=4

				// as of know num_03 is in ascending order even though sorting is completed
				// i will incremented to i=3,j=4
				// then i=4,j=5
				// then i=4,j=6=>Now J loop will fail then 'i' will incremented from i=4 to i=5

				// then i=5,j=6=>Now J loop will fail then 'i' will incremented from i=5 to i=6
				// then i=6;6<length of the array(6) then i loop will end

				// num_03=1,3,5,8,9,22

			}
		}
		for (int i = 0; i < num_03.length; i++) {
			System.out.print(" " + num_03[i]);// num_03=1,3,5,8,9,22
		}
	}
}
