package day13;

public class pro8 {

	public static void main(String[] args) {
		int[] salary = { 50000, 30000, 70000, 60000 };
		int first = 0;
		int second = 0;
		for (int i = 0; i < salary.length; i++) {
			if (first < salary[i]) {
				second = first;
				first = salary[i];
			} else if (second < salary[i] && first > salary[i]) {
				second = salary[i];
			}
		}
		System.out.println("second largest is:" + second);
	}

}