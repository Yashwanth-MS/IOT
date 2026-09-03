package day12;

public class pro5 {

	public static void main(String[] args) {
		        String text = "ABCCDDAEFG";
		        String pattern = "CDD";

		        int n = text.length();
		        int m = pattern.length();

		        int pHash = 0;
		        int tHash = 0;

		        // Calculate hash
		        for (int i = 0; i < m; i++) {
		            pHash += pattern.charAt(i);
		            tHash += text.charAt(i);
		        }

		        // Search
		        for (int i = 0; i <= n - m; i++) {

		            if (pHash == tHash) {

		                int j;

		                for (j = 0; j < m; j++) {
		                    if (text.charAt(i + j) != pattern.charAt(j)) {
		                        break;
		                    }
		                }

		                if (j == m) {
		                    System.out.println("Pattern found at index " + i);
		                }
		            }

		            // Update hash
		            if (i < n - m) {
		                tHash = tHash - text.charAt(i)
		                              + text.charAt(i + m);
		            }
		        }
		    }
		
		// TODO Auto-generated method stub

	}