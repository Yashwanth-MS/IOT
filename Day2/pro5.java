package day2;
public class pro5 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		pro5   vv = new pro5();
		vv.m1(4,3);
		vv.m2();
	}
}
