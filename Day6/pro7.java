package day6;

public class pro7 {

	public static void main(String[] args) {
		int[] profit = {5,3,-2,4,-10,6,2};
		int currentProfit = 0;
		int bestprofit = 0;
		for(int i =0;i<profit.length;i++) {
			currentProfit +=profit[i];
			if(currentProfit <0) {
				currentProfit =0;
			}
			if(currentProfit>bestprofit) {
				bestprofit = currentProfit;
			}
		}
		System.out.println("maximum profit:"+bestprofit);
	}

}
