package basic_005;
// write a java code to print instance variable

public class A005_instancevariable {
	int a=25, b=5,c;
	public void add() {
		c=a+b;
		System.out.println("Addition of two numbers: "+c);
		
	}
	public void subtract() {
		c=a-b;
		System.out.println("Subtraction of two numbers: "+c);
	}
	
	public void multiple() {
		c=a*b;
		System.out.println("Multiplication of two numbers: "+c);
	}
	public void divide() {
		c=a/b;
		System.out.println("Division of two numbers: "+c);
	}
	public void modulo() {
		c=a%b;
		System.out.println("Modulo of two numbers: "+c);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A005_instancevariable obj=new A005_instancevariable();
		obj.add();
		obj.subtract();
		obj.multiple();
		obj.divide();
		obj.modulo();
		
		
		

	}

}
