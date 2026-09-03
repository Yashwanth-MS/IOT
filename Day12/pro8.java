package day12;

public class pro8 {

	public static void main(String[] args) {

		int[] shares = { 7, 1, 5, 3, 6, 4 };

		int buy = shares[0];
		int profit = 0;

		for (int i = 1; i < shares.length; i++) {

			if (shares[i] < buy) {
				buy = shares[i];
			}

			int currentProfit = shares[i] - buy;

			if (currentProfit > profit) {
				profit = currentProfit;
			}
		}

		System.out.println("Max profit is: " + profit);
	}
}