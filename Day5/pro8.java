package day5;

public class pro8 {

    public static void main(String[] args) {

        String text = "programming";

        findDuplicates(text);
    }

    static void findDuplicates(String text) {

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (text.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
