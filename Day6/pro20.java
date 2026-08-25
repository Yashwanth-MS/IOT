package day6;

import java.util.Arrays;

public class pro20 {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 2, 4};

        Arrays.sort(numbers);

        System.out.println("Ascending order:");

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
