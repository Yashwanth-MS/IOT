package day13;

public class pro6 {

	public static void main(String[] args) {
		int[] ID= {101,102,103,104};
		int target = 103;
		boolean exists=true;
		for(int i=0;i<ID.length;i++) {
			if(target==ID[i]) {
				exists=true;
				break;
			}else {
				exists = false;
			}
		}
		if(exists) {
			System.out.println("product ID exists");
		}else {
			System.out.println("ID doesn't exists");
		}
	}

}
