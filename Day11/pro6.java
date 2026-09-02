package day11;

import java.util.Scanner;

public class pro6{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            System.out.println(a);

            int c = a + b;

            a = b;
            b = c;
        }

        sc.close();
    }
}