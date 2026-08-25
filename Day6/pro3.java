package day6;

public class pro3 {

	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50};
		int windowSize = 3;
		int sum =0;
		for(int i = 0;i<windowSize;i++) {
			sum+=numbers[i];
		}
		System.out.println("sum="+sum);
		int start = 0;
		for(int end = windowSize;end<numbers.length;end++) {
			sum -= numbers[start];
			sum += numbers[end];
			start++;
			System.out.println("sum="+sum);
		}
	}

}
