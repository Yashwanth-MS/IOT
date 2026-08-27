package day7;

public class pro4 {
	static void reverse(int n) {
		if(n==0) {
			return;
		}
		System.out.println("withdraw 2k successful , remaining:"+(n-2000));
		reverse(n-2000);
	}

	public static void main(String[] args) {
		System.out.println("Balance = 10000");
		reverse(10000);
		System.out.println("Balance = 0");
		
	}

}
