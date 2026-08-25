package day6;

public class pro15 {

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30};
        int[] array2 = {30, 40, 50};

        int[] union = new int[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            union[k++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j] == array2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = array2[i];
            }
        }

        System.out.println("Union of arrays:");

        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
