package day13;

public class pro1 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        System.out.print("Unique elements: ");

        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}