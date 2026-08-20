package day4;
import java.util.Scanner;
public class pro12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice(1 for +  ,2 for -  ,3 for *  ,4 for /)");
		int choice = sc.nextInt();
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("sum:"+(a+b));
			break;
		case 2:
			System.out.println("substraction of two numbers: "
					+ ""+(a-b));
			break;
		case 3:
			System.out.println("multiplication of two numbers: "+(a*b));
			break;
		case 4:
			System.out.println("division of two numbers is :"+(a/b));
			break;
		}

	}

}
