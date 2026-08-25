package day6;

public class pro14 {

	public static void main(String[] args) {
		String[] array1 = {"hi","bye"};
		String[] array2 = {"mark","go"};
		String[] merged = new String[array1.length + array2.length];
		for(int i=0;i<array1.length;i++) {
			merged[i] = array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			merged[array1.length+i]=array2[i];
		}
		System.out.println("merged array: ");
		for(int i=0;i<merged.length;i++) {
			System.out.print(merged[i]+" ");
		}
	}
}