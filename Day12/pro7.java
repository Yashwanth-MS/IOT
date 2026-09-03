package day12;

public class pro7 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2 };

		boolean duplicate = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}

			if (duplicate) {
				break;
			}
		}

		if (duplicate) {
			System.out.println("Array contains duplicate number");
		} else {
			System.out.println("No duplicate numbers");
		}
	}
}