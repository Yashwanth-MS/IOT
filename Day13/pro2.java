package day13;

public class pro2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.print("Unique elements: ");

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}