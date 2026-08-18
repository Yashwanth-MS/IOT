package day2;

public class pro15 {

	public static void main(String[] args) {
		String a="abcd";
		String rev = "";
		for(int i=a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);

	}

}
