package day6;

public class pro17 {

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30};
        int[] array2 = {30, 40, 50};

        int k = 0;
        int[] intersection = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    intersection[k] = array1[i];
                    k++;
                }
            }
        }

        System.out.println("Intersection of arrays:");

        for (int i = 0; i < k; i++) {
            System.out.print(intersection[i] + " ");
        }
    }
}
