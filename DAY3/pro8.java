
package day3;

public class pro8 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}

	public static void main(String[] args) {
		pro8 test=new pro8();
		test.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("main method"+i);
		}
		

	}

}
