package day5;
import java.util.Scanner;

public class pro5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println("the string is palindrome");
			
		}else {
			System.out.println("the string is not palindrome");
			
		}

	}

}
