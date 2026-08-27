package day7;

public class pro5 {

	public static void main(String[] args) {
		int balance = 10000;
		for(int i = balance-2000;i>=0;i=i-2000) {
			System.out.println("withdrawed 2k, balance:"+i);
		}
	}

}
