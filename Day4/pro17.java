package day4;

public class pro17 {

	public static void main(String[] args) {
		int[] marks = {78, 65, 89, 92, 71};
		int max = 0;
		for(int i =0;i<marks.length;i++) {
			if(marks[i]>max) {
				max = marks[i];
			}
		}
		System.out.println("highest marks is:"+max);

	}

}
