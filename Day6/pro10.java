package day6;

public class pro10 {

	public static void main(String[] args) {
		int[] marks = {100,100,150,100,50};
		int[] prefixsum = new int[marks.length];
		prefixsum[0] = marks[0];
		for(int i =1;i<marks.length;i++) {
			prefixsum[i] = prefixsum[i-1] + marks[i];
		}
		int sum = prefixsum[2] - prefixsum[0];
		System.out.println("total sum=₹"+sum);
	}

}
