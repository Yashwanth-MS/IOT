package day6;

public class pro11 {

    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 140, 150};
        int windowsize = 3;
        int highsum = 0;
        for (int left = 0; left <= numbers.length - windowsize; left++) {
            int sum = 0;
            for (int i = left; i < left + windowsize; i++) {
                sum = sum + numbers[i];
            }
            if (sum > highsum) {
                highsum = sum;
            }
        }
        System.out.println("highest sum: " + highsum);
    }
}

