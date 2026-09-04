package day13;

public class pro3 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 4, 5 };

		int n = arr.length;

		int total = n * (n + 1) / 2;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int missing = total - sum;

		System.out.println("Missing number: " + missing);
	}
}