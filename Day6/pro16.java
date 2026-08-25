package day6;

public class pro16 {

    public static void main(String[] args) {

        String[] array1 = {"hi", "bye"};
        String[] array2 = {"mark","hi", "go"};

        String[] union = new String[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            union[k++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j].equals(array2[i])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = array2[i];
            }
        }

        System.out.println("Union array:");

        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
