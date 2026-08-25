package day6;

public class pro5 {

	public static void main(String[] args) {
		int[] numbers = {2,3,1,2,4,3};
		int target=7;
		int start = 0;
		int sum =0;
		int minlength = numbers.length;
		for(int end = 0;end < numbers.length;end++) {
			sum = sum + numbers[end];
			while(sum>=target) {
				int length = end - start +1;
				if(length < minlength) {
					minlength = length;
				}
				sum = sum - numbers[start];
				start++;
			}
		}
		System.out.println("smallest window length="+minlength);
	}

}

