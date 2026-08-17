import java.util.Scanner;

public class palindrome {
	void palind(String s,String rev) {
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Palindrome of "+s+" is:"+rev);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		palindrome pal1=new palindrome();
		pal1.palind(s, rev);
		sc.close();
	}

}