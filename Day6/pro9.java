package day6;

public class pro9 {

	public static void main(String[] args) {
		int[] expenses = {100,200,150,300,250};
		int[] prefixsum = new int[expenses.length];
		prefixsum[0] = expenses[0];
		for(int i =1;i<expenses.length;i++) {
			prefixsum[i] = prefixsum[i-1] + expenses[i];
		}
		int sum = prefixsum[3] - prefixsum[0];
		System.out.println("total sum=₹"+sum);


	}

}
