package day7;
import java.util.Scanner;

public class pro8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        boolean hasCapital = false;
	        for (char ch : password.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                hasCapital = true;
	            }
	            
	        }
	        if (password.length() > 8 && hasCapital) {
	            System.out.println("Valid password");
	        } else {
	            System.out.println("Invalid password");
	        }

	        sc.close();
	    }

}
