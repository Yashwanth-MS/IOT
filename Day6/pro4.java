package day6;

public class pro4 {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		int windowsize = 3;
		int sum = 0;
		int left = 0;
		int right = windowsize;

		while (right <= numbers.length) {

			for (int i = left; i < right; i++) {
				sum = sum + numbers[i];
			}

			System.out.println(sum);

			left++;
			right++;
			sum = 0;
		}
	}
}
