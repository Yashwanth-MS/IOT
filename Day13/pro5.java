package day13;

public class pro5 {

	public static void main(String[] args) {
		int[] ids = {10,15,20,25,30};
		int count = 0;
		for(int i = 0;i<ids.length;i++) {
			if(ids[i]%2==0) {
				count++;
			}
		}
		System.out.println("Total even ids are:"+count);
	}

}
