package day2;
//method overloading
public class demo {
	void m1() {
		System.out.println("sdfa");
	}
	void m1(int a) {
		System.out.println("dfasdfasdfasfas");
	}
	public static void main(String[] args) {
		demo test = new demo();// object
		test.m1();
		test.m1(3);
	}
}
