package day4;
import java.util.Scanner;
public class pro14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--menu--");
		System.out.println("1.pizza");
		System.out.println("2.pasta");
		System.out.println("3.burger");
		System.out.println("4.biryani");
		System.out.println("enter the choice");
		int day = sc.nextInt();
		switch(day){
		case 1:
			System.out.println("pizza ordered");
			break;
		case 2:
			System.out.println("pasta ordered");
			break;
		case 3:
			System.out.println("burger ordered");
			break;
		case 4:
			System.out.println("biryani ordered");
			break;
		default:
			System.out.println("ivalid choice");
			
		}
		sc.close();
	}

}
