package basic_004;
//increment example
public class A011_pre_post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("starting value " +x);//x=5
		System.out.println("pre increment "+(++x));//x=1+5=6
		System.out.println("value after pre increment "+x);//x=6
		 
		System.out.println("------------------------------");
		 x=5;
		 System.out.println("after assigning default value "+x);//x=5
		 System.out.println("post increment "+(x++));//x=5
		 System.out.println("after post increment "+x);// 6=++X     ----------//x=6 
		 
		System.out.println("------------------------------");
		x=5;
		System.out.println("starting value"+x);
		x=++x;
		System.out.println("after pre increment "+x);//6
		
		
		
		System.out.println("------------------------------");
		
		x=5;
		System.out.println("starting value" +x );//x=5
		 
		int y=++x;
		System.out.println("after preincrement of x "+(x));//x=6
		
		System.out.println("------------------------------");
		
		x=5;
		System.out.println("starting value" +x );//x=5
		 
		y=++x * 2;//6
		System.out.println("after preincrement of x "+(x));//x=6
		System.out.println(y);
		
		System.out.println("------------------------------");
		
		x=5;
		System.out.println("starting value" +x );//x=5
		 
		y=x * 2;//(5+1)*2=12=y
		System.out.println("after preincrement of x "+(x));//x=6
		System.out.println(y);//10
		
		
		
		
		System.out.println("------------------------------");
		x=5;
		System.out.println("starting value" +x );//x=5
		 
		y=x++ * 2;//(5+1)*2=12=y
		System.out.println("after preincrement of x "+(x));//x=6*2
		System.out.println(y);//12
		
		int z=x+y;
		System.out.println(z);//6+10=16
		
		
		System.out.println("------------------------------");
		
		x=0;
		while (++x < 5) {//0<1,1<5,2<5,3<5,4<5,5<5
			System.out.println("value of x "+(x));//1,2,3,4
			
		}
		
		
		
		System.out.println("------------------------------");
		
		x=0;
		while (x++ < 5) {//0<1,1<5,2<5,3<5,4<5,5<5
			System.out.println("value of x "+(x));//1,2,3,4,5
			
		}
		
		System.out.println("------------------------------");
		
		x=0;
		do  {//0<1,1<5,2<5,3<5,4<5,5<5
			System.out.println("value of x "+(x));//1,2,3,4,5
			
		}while((++x) < 5);
		
		System.out.println("------------------------------");
		
		x=0;
		do  {//0<1,1<5,2<5,3<5,4<5,5<5
			System.out.println("value of x "+(x));//1,2,3,4,5
			
		}while((++x) < 5);
		
		
		System.out.println("------------------------------");
		
		x=0;
		do  {//0<1,1<5,2<5,3<5,4<5,5<5
			System.out.println("value of x "+(x++));//1,2,3,4,5
			
		}while((x) < 5);
		
	}

}
