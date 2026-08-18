package day2;
class Parents {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
public class pro7 extends Parents {

	public static void main(String[] args) {
		pro7 test = new pro7();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}
