package day7;

public class pro1 {
	static void methodA() {
		System.out.println("inside methodA");
		methodB();
		System.out.println("back to methodA");
	}
	static void methodB() {
		methodC();
		System.out.println("inside methodB");
	}
	static void methodC() {
		System.out.println("inside methodB");
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		methodA();
		System.out.println("back to main");
	}

}
