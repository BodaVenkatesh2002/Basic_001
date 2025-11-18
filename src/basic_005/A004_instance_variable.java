package basic_005;

public class A004_instance_variable {
	int x=100; // instance variable
	public void  m1() { // m1 is a method name
		System.out.println(x);
		A004_instance_variable obj1=new A004_instance_variable();
		System.out.println(obj1.x);
		
	}
	public void m2() {
		A004_instance_variable obj2=new A004_instance_variable();
		System.out.println(obj2.x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A004_instance_variable obj =new A004_instance_variable();
		System.out.println(obj.x);
		obj.m1();
		obj.m2();
		
		
	

	}

}
