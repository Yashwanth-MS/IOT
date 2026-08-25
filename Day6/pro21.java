
import java.util.Arrays;

public class pro21 {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 2, 4};

        Arrays.sort(numbers);

        System.out.println("Descending order:");

        for(int i = numbers.length-1; i >=0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
