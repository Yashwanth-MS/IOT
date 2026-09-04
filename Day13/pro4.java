package day13;

public class pro4 {

	public static void main(String[] args) {
		int[] salaries = {25000,40000,30000,50000};
		int max=0;
		for(int i = 1;i<salaries.length;i++) {
			if(salaries[i-1]<salaries[i]) {
				max = salaries[i];
			}else {
				max = salaries[i-1];
			}
		}
		System.out.println("Maximum Salary:"+max);
	}

}
