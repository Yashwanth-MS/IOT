package day13;

public class pro7 {

	public static void main(String[] args) {
		int[] ID = { 101, 102, 101, 103, 101 };
		int count = 0;
		int target = 101;
		for (int i = 0; i < ID.length; i++) {
			if (target == ID[i]) {
				count++;
			}
		}
		System.out.println("The employee ID " + target + " is repeated " + count + " times");
	}

}
