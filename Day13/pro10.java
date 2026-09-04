package day13;

public class pro10 {

	public static void main(String[] args) {
		String name = "yash";
		String vowel = "aeiou";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < vowel.length(); j++) {
				if (name.charAt(i) == vowel.charAt(j)) {
					count++;
				}
			}

		}
		System.out.println("Total no of vowels in " + name + " is " + count);
	}

}

