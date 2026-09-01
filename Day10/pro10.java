package day10;

public class pro10 {
    public static void main(String[] args) {
        int[] arrival = {9, 9, 10, 10, 11};
        int[] department = {10, 11, 10, 11, 12};
        int lastFinish = 0;
        System.out.println("Selected Activities:");
        for (int i = 0; i < arrival.length; i++) {
            if (arrival[i] >= lastFinish) {
                System.out.println("Activity " + (i + 1) +" : " + arrival[i] + "-" + department[i]);
                lastFinish = department[i];
            }
        }
    }
}