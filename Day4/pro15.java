package day4;
import java.util.Scanner;
public class pro15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = n;i>0;i--) {
			sum += i;
		}
		System.out.println("total sum is:"+sum);
	}

}
