package day12;

public class pro9 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };

		int[] result = new int[arr.length];

		int index = 0;

		for (int num : arr) {

			if (num != 0) {
				result[index] = num;
				index++;
			}
		}

		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}