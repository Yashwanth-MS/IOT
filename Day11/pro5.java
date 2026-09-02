package day11;

public class pro5 {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] dp = new int[rows][cols];

        dp[0][0] = arr[0][0];

        
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }

        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                dp[i][j] = arr[i][j]
                         + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("Minimum path sum = " + dp[rows - 1][cols - 1]);
    }
}