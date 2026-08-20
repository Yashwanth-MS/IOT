package day4;
import java.util.Scanner;
public class pro13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the day number(1 to 7)");
		int day = sc.nextInt();
		switch(day){
		case 1:
			System.out.println("it is sunday");
			break;
		case 2:
			System.out.println("it is monday");
			break;
		case 3:
			System.out.println("it is tuesday");
			break;
		case 4:
			System.out.println("it is wednesday");
			break;
		case 5:
			System.out.println("it is thursday");
			break;
		case 6:
			System.out.println("it is friday");
			break;
		case 7:
			System.out.println("it is saturday");
			break;
		default:
			System.out.println("error! enter day between 1 to 7");
			
		}
		sc.close();
	}

}
