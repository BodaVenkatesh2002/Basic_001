package practice_001;
//write a java code to convert int to double,double to int,string to int,
//int to string
public class Pr007_typeconver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int to double
		int val=145;
		double db=val;//145.0
		System.out.println(db);//db=145.0
		//double to int
		double g=57.82;
		int xt=(int)g;//57
		System.out.println(xt);//xt=57
		//string to int
		String str="45";
		int hb=Integer.valueOf(str);//45
		System.out.println(hb);//hb=45
		//int to string
		int xtn=567;
		String smt=String.valueOf(g);//567
		System.out.println(smt);
		System.out.println("hello world");
		

	}

}
