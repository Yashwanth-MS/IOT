package day6;

public class pro18 {

    public static void main(String[] args) {

        String[] array1 = {"hi","bye"};
        String[] array2 = {"good","hi"};

        int k = 0;
        String[] intersection = new String[array1.length];

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
