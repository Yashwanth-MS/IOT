package day4;
public class pro16 {

	public static void main(String[] args) {
		int days = 7;
		int[] units = {10,15,12,20,18,16,14};
		int totalunit=0;
		for (int i = 0;i < days;i++) {
			totalunit += units[i];
		}
		System.out.println("total electricity consuption:"+totalunit);
	}

}
