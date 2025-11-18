package basic_006;
//write a java code to print sum of array

public class A002_sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,10};
		System.out.println("the size of the array is "+arr.length);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}System.out.println(sum);
		
		

	}

}
