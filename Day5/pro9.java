package day5;

public class pro9 {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            int count1 = 0;
            int count2 = 0;

           
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) {
                    count1++;
                }
            }

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == ch) {
                    count2++;
                }
            }
            if (count1 != count2) {
                return false;
            }
        }

        return true;
    }
}
