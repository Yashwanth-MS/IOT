package day4;

public class pro18 {

	public static void main(String[] args) {
		int[] marks = {35, 67, 89, 22, 45, 30, 76};
		int pass = 0;
		for(int i = 0; i<marks.length;i++) {
			if(marks[i]>=40) {
				pass += 1;
			}
		}
		System.out.println("total number of student passed: "+pass);

	}

}
