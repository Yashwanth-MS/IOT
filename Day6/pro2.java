package day6;

public class pro2 {

	public static void main(String[] args) {
		int[] marks = {30,40,50,60,40};
		int target = 80;
		int left = 0;
		int right = marks.length-1;
		while(left < right) {
			int sum = marks[left] + marks[right];
			if(sum == target) {
				System.out.println("two subjects marks that are greater than 80:"+marks[left]+" and "+marks[right]);
				break;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
				
			}
		}

	}

}
