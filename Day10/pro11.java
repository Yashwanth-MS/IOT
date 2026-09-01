package day10;

public class pro11 {
    public static void main(String[] args) {
        String[] meeting = {"A", "B", "C", "D", "E"};
        int[] start = {900, 930, 1000, 1100, 1130};
        int[] end   = {1000, 1100, 1100, 1200, 1300};
        int lastEnd = 0;
        for (int i = 0; i < meeting.length; i++) {
            if (start[i] >= lastEnd) {
                System.out.println("meeting "+meeting[i]);
                lastEnd = end[i];
            }
        }
    }
}