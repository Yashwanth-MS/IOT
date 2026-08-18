package day2;

public class pro11 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i = i - 2) {

            for (int k = 1; k <= (n - i) / 2; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
