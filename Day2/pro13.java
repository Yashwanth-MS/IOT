public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("153 is an Armstrong number");
        } else {
            System.out.println("153 is not an Armstrong number");
        }
    }
}
